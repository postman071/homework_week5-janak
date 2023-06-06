/**
 * 4. Write a java program to create a new array list, add some colours(String) and printout the collection
 * using for each loop.
 */

package homework_week5;

import java.util.ArrayList;
public  class Programme_4
{
    public static void main(String[] args)
    {
     Programme_4 p4 =new Programme_4(); // Create an object for class
        p4.colours();  // Call the method with help of object

    }
    public void colours()    // No return type with no parameters method
    {
        ArrayList<String> colorName = new ArrayList<>();
        colorName.add("Black");
        colorName.add("Red");
        colorName.add("Purple");
        colorName.add("Yellow");
        colorName.add("White");

        // Using foreach loop
        for (String str : colorName)
        {
            System.out.println(str);
        }

    }

}
