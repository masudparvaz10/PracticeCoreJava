package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class UseTraversHashMap {

    public static void main(String[] args) {

        int[] number = {12, 13, 14, 7, 5, 9, 5};
        printFrequency(number);

    }

    // Java Documentation:
    /**
     * This Method will find out the frequency from an Array
     *
     * @param arr
     */
    public static void printFrequency(int arr[]) {
        // Create an empty HashMap
        HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
        // Integer is a wrapper class:
        // Travers through the given array
        for (int i = 0; i < arr.length; i++) {
            Integer c = hmap.get(arr[i]);

            // If this is first occurrence of element
            if (hmap.get(arr[i]) == null)
                hmap.put(arr[i], 1);
            else
                hmap.put(arr[i], ++c);
        }

        // print result
        for (Map.Entry entry : hmap.entrySet()) {
            System.out.println("Frequency of  " + entry.getKey() + " is " + entry.getValue());
        }

        // Lambda Expression


    }
}
