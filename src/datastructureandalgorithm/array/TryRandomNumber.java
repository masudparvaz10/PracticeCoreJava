package datastructureandalgorithm.array;

import java.util.Random;

public class UseRandomNumber {


    public static void main(String[] args) {

        int[] studentID=new int[20];
        Random random=new Random(1);
        for (int i=0; i<studentID.length;i++){
            studentID[i]=random.nextInt(400);
            System.out.println("Student ID : NY2020"+studentID[i]+1);
        }





    }

}
