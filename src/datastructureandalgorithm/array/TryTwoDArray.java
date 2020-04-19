package datastructureandalgorithm.array;

public class UseTwoDArray {

    // Two Dimension Array: 2D Array
    // DataType[][] arrayName=new DataType[Row][Column]
    static String[][] stName = new String[5][6];

    // 2D Array Declare and Initialization
    String[][] customerName={{"Sl","customerName","phoneNumber"}, {"1","Mr X","8564684368"}, {"2","Mr Y","8564684369"}};

    public static void main(String[] args) {

        stName[0][0] = "SI";
        stName[0][1] = "FastName";
        stName[0][2] = "LastName";
        stName[0][3] = "Address";
        stName[0][4] = "ContactNumber";
        stName[0][5] = "Score";

        stName[1][0] = "1";
        stName[1][1] = "Masud1";
        stName[1][2] = "Parvez1";
        stName[1][3] = "Jamaica,NY1";
        stName[1][4] = "5468668";
        stName[1][5] = "A+";

        stName[2][0] = "2";
        stName[2][1] = "Masud2";
        stName[2][2] = "Parvez2";
        stName[2][3] = "Jamaica,NY2";
        stName[2][4] = "5468669";
        stName[2][5] = "A";

        stName[4][5] = "Index check";
        //System.out.println(stName[5][6]);
        System.out.println(stName[4][5]);
        System.out.println(stName.length);

        // To Retrieve all the value from 2D Array
        for (int i = 0; i < stName.length; i++) {
            for (int j = 0; j < stName[i].length; j++) {
                System.out.print(stName[i][j] + "\t  ");
            }
            System.out.println();
        }

        // 2D Array Declare and Initialization
        String[][] employeeName={
                {"Sl","employeeName","phoneNumber"},
                {"1","Mr T","85646843648"},
                {"2","Mr P","85646842369"}
        };




    }


}
