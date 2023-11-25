package lab1;

import java.util.Scanner;

public class example15 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Input the first number: ");
        Number first = in.nextInt();

        System.out.println("Input the second number: ");
        Number second = in.nextInt();
        int summ = first.intValue()+second.intValue();
        int r = first.intValue()-second.intValue();
        System.out.println("Your summ is "+summ);
        System.out.println("Your raz is "+r);
    }
}
