package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    public void example() {
        //Entering a data arbitrarily
        //Entering a data dynamically, custom array with data
        String name[] = {"a", "b", "c", "d", "e"};

        //Print out unsorted array
        //toString converts the array into a string to be printed
        System.out.println("Unsorted array: " + Arrays.toString(name));

        //Sort the array in ascending order
        Arrays.sort(name);

        //print out the sorted array
        System.out.println("Sorted array: " + Arrays.toString(name));

        //Sort array in descending order
        Arrays.sort(name, Collections.reverseOrder());

        //Print sorted array
        System.out.println("Sorted array (reverse): " + Arrays.toString(name));

    }
    
}
