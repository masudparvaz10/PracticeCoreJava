package datastructureandalgorithm.array;

public class UseArray {
    // variable
    String fName; // variable Declare
    String name = "Masud"; // Variable Declare and Initialize

    // Single Dimension Array
    // Array is a kind of variable which hold multiple value
    // Array Index start from Zero
   static String[] name1 = new String[5]; // Array Declare
    static String[] phone=new String[9];
    static String[] pen=new String[8];
    static String[] mouse=new String[7];
    static String[] bord=new String[6];
    static String[] drink=new String[4];


   static String[] name2 = {"Masud", "Jack", "Jony"};  // Array Declare and Initialize

    static String[] stName=new String[50];


    public static void main(String[] args) {
        System.out.println(name2.length); // to find out array Length we use length

        name1[0]="William";
        name1[1]="Robert";
        name1[2]="Alex";
        name1[3]="Julian";
        name1[4]="Max";

        System.out.println(name1[3]);
        System.out.println(name2[1]);
        System.out.println(name2[1]+" "+name2[2]);
        // Array Index out of Bound Exception
       // System.out.println(name2[1]+" "+name2[3]);
        System.out.println(name2[1]+" "+name1[3]);

        stName[0]="William";
        stName[1]="Robert";
        stName[2]="Alex";
        stName[3]="Julian";
        stName[4]="Max";
        stName[5]="Mix";
        stName[6]="Maxi";
        stName[7]="Mapi";
        stName[8]="Messi";

        // For Loop to Retrieve Data from Array
//        for (int i=0; i<stName.length; i++){
//            System.out.println(stName[i]);
//        }

        // For Each Loop to Retrieve Data from Array
        for (String st: stName) {
            System.out.println("Student Name is "+st);

        }



    }




}
