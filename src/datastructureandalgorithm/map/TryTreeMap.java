package datastructureandalgorithm.map;

import java.util.Map;
import java.util.TreeMap;

public class UseTreeMap {

    //
    public static void main(String[] args) {
        // Tree Map

        // Creating TreeMap of even Number
        TreeMap <String,Integer> evenNumbers=new TreeMap<>();
        //Using Put()
        evenNumbers.put("Two",2);
        evenNumbers.put("Four",4);
        evenNumbers.put("Eight",8);
        // Using PutAbsent()
        evenNumbers.putIfAbsent("Six",6);
        System.out.println("Tree Map of even numbers: "+evenNumbers);

        TreeMap <String,Integer> numbers=new TreeMap<>();
        numbers.put("One",1);
        numbers.putAll(evenNumbers);
        System.out.println("Tree Map of  numbers: "+numbers);

        System.out.println("************");
        numbers.forEach((k,v)-> System.out.println((k+" : "+v)));
        System.out.println("=============");
        
        for (String st: numbers.keySet()) {
            System.out.println(st+" : "+numbers.get(st));

        }
    }




}
