package lab1;

import java.util.Scanner;

public class example14 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);

        System.out.println("Input the number: ");
        Number first = in.nextInt();
        int numb= first.intValue();
        int m = numb-1;
        int b = numb+1;
        int summ=numb+m+b;
        int srr = summ*summ;
        String a =" ";
        System.out.println("Your numbers is "+numb+a+m+a+b+a+srr);
    }
}
