package anagrum;

import java.util.Arrays;

public class TryAnagram {
    // Do Anagram
    public static boolean isAnagram(String a, String b){
        // compare length of character

        boolean status=true;

        if (a.length()!=b.length()){
            status=false;
        }

        else {
            char[] ArrayS1 = a.toLowerCase().toCharArray();
            char[] ArrayS2 = b.toLowerCase().toCharArray();

            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        System.out.println(a+" "+b+" "+status);
        return status;

    }


    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram.
        // Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        isAnagram("Cat","Tac");// anagram
        isAnagram("Army","MARY");// anagram
        isAnagram("tiger","Lion");// not anagram
        isAnagram("tiger","itger");// anagram
        isAnagram("Masud","amsutd");

    }

}
