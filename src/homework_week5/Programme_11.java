package homework_week5;

/**
 *11.Declare following two Arrylist and compare it.
 *   ArrayList<String> c1= new ArrayList<String>();
 *   c1.add("Red");
 *   c1.add("Green");
 *   c1.add("Black");
 *   c1.add("White");
 *   c1.add("Pink");
 *   ArrayList<String> c2= new ArrayList<String>();
 *   c2.add("Red");
 *   c2.add("Green");
 *   c2.add("Black");
 *   c2.add("Pink");
 */

import java.util.ArrayList;

public class Programme_11
{
    public static void main(String[] args)
    {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("The two ArrayList are equal? " + c1.equals(c2));
    }
}
