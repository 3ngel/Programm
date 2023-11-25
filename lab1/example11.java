package lab1;

import java.util.Scanner;

public class example11 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Input your your of borth: ");
        Number year = in.nextInt();
        int age = 2023- year.intValue();

        System.out.println("Input name: ");
        String name = in.next();


        System.out.println("Hello, "+name+". Your age is "+age );
    }
}
