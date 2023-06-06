/**
 * 7. Write a Java program to test if an aaray list is empty or not.
 */
package homework_week5;

import java.util.ArrayList;
public class Programme_7
{
    public static void main(String[] args)
    {
        // ArrayList of String Type
        ArrayList<String> arr = new ArrayList<>();

        // Checking Weather the list is empty
        System.out.println("Is ArrayList Empty" + arr.isEmpty());

        //Adding String elements
        arr.add("Java");
        arr.add("Python");
        arr.add("C++");
        arr.add("PHP");


        // Again check for isEmpty
        System.out.println("Is Array Empty :" +arr.isEmpty());
    }
}
