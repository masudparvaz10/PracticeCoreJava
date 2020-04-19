package datastructureandalgorithm.map;

import java.util.*;

public class UseListHashMap {

    public static void main(String[] args) {

        List<String> stateOfUSA=new ArrayList<>();
        stateOfUSA.add("NY");
        stateOfUSA.add("NJ");
        stateOfUSA.add("FL");
        stateOfUSA.add("KA");

        List<String> stateOfCanada=new ArrayList<>();
        stateOfCanada.add("Toronto");
        stateOfCanada.add("Alberta");
        stateOfCanada.add("Vancouver");
        stateOfCanada.add("Ontario");

        List<String> stateOfBangladesh=new ArrayList<>();
        stateOfBangladesh.add("Dhaka");
        stateOfBangladesh.add("Khulna");
        stateOfBangladesh.add("Ctg");
        stateOfBangladesh.add("Cox");

        Map<String,List<String>> country=new HashMap<>();
        country.put("USA",stateOfUSA);
        country.put("CANADA",stateOfCanada);
        country.put("BANGLADESH",stateOfBangladesh);

        for (Map.Entry<String,List<String>> entry:country.entrySet()) {
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

    }
}
