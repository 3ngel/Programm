package lab1;

import java.util.Scanner;
public class example10 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Input your your of borth: ");
        Number year = in.nextInt();
        Number age = 2023- year.intValue();
        System.out.println("Your age is "+age );
    }
}
