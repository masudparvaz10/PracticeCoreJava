package datastructureandalgorithm.map;

import java.util.HashMap;
import java.util.Map;

public class UseMap {
    
    // Map:
    // Map<Key,Value> mapName=new HashMap<>();

    public static void main(String[] args) {
        Map <String,String> cityName=new HashMap<>();
        cityName.put("Queens","Elmhurst");

        Map <String,String> stateName=new HashMap<>();
        stateName.put("US","NewYork");
        stateName.put("Pakistan","Karachi");
        stateName.put("India","Delhi");
        stateName.put("Canada","Toronto");
        stateName.put("Bangladesh","Dhaka");
        stateName.put("Bangladesh","Mugdapara");
        stateName.putAll(cityName);
        System.out.println(stateName.size());

        String india=stateName.get("India");
        System.out.println(india);

        for (Map.Entry<String,String> entry:stateName.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());

        }


        System.out.println("************************");

        for (String st: stateName.keySet()) {
            System.out.println(st+" : "+stateName.get(st));

        }

        System.out.println("========================");
        // Lambda Expression

        stateName.forEach((k,v) -> System.out.println((k+" : "+v)));

        stateName.forEach((k,v)-> System.out.println((k+" : "+v)));



    }
    
    
    
    
    
    
}
