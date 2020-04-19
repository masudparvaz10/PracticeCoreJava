package problemandsolutions;

public class PrintLastTwoDigit {
    public static void main(String[] args) {
        float a1=45.25f;
        float a2=35.24f;
        float a3=a1*a2;
        System.out.println(a3);
        //converting/casting to String
       String a4= Float.toString(a3);

//        String lastTwoDigit =null;
//
//        if (a4.length()>4){
//            lastTwoDigit=a4.substring(a4.length()-3);
//        } else
//        {
//            lastTwoDigit=a4;
//        }
//
//        System.out.println(lastTwoDigit);

        System.out.println(a4.substring(a4.length()-2));
        //System.out.println(Float.toString(a3).substring(Float.toString(a3).length()-3));
    }
}
