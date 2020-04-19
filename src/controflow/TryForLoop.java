package controflow;

public class TryLoop {
    public static void main(String[] args) {
int x=5;
        for (int i=13;i>9;i--) {//work
            System.out.println("This is default loop=&&&&"+x);
        }
        for (int i=0;i<6;i++) {// work
            System.out.println("This is another loop....."+x);
            for (int p=0;p<3;p++) {
                System.out.println("This is nested loop==="+x);
            }
        }
    }
}
