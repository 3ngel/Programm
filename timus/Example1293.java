package timus;
import java.util.Scanner;
public class Example1293 {
    public static void main(String[] args){
        Scanner in =  new Scanner(System.in);

        System.out.println("Input count panels ");
        int count = in.nextInt();
        System.out.println("Input height of panels ");
        int h = in.nextInt();
        System.out.println("Input weight of places ");
        int w = in.nextInt();
        int numer=count*h*w;
        System.out.println("You need sys "+numer);
    }
}
