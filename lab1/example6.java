package lab1;

import java.util.Scanner;
public class example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Input lastname: ");
        String lastname = in.nextLine();

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        String a = " ";
        System.out.println("Hello, "+lastname+a+name+a+patronymic);
        in.close();
    }
}
