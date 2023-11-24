package lab1;

import java.util.Scanner;
public class example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Input day of week: ");
        String lastname = in.nextLine();

        System.out.println("Input moth name: ");
        String name = in.nextLine();

        System.out.println("Input number day: ");
        Number patronymic = in.nextInt();

        String a = " ";
        System.out.println("You input this day"+lastname+a+name+a+patronymic);
        in.close();
    }
}
