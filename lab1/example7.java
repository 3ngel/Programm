package lab1;

import java.util.Scanner;
public class example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        Number patronymic = in.nextInt();

        System.out.println("Hello, "+name+". Your age is "+patronymic);
        in.close();
    }
}