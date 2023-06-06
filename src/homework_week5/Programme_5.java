/**
 * 5. Write a java program t iterate through all elements in an array list using Iterater.
 */

package homework_week5;

import java.util.ArrayList;
import java.util.Iterator;


public class Programme_5
{
    public static void main(String[] args)
    {
        iterate_Method();        // Direct Method calling
    }
    public static void iterate_Method()
    {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(100);
        List.add(200);
        List.add(300);
        List.add(400);
        List.add(500);


        Iterator itr = List.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.hasNext());
        }

    }
}
