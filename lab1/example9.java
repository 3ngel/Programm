package lab1;

import java.util.Scanner;
public class example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Input moth name: ");
        String name = in.nextLine();

        System.out.println("Input count dau in this moth: ");
        Number patronymic = in.nextInt();

        String a = " ";
        System.out.println("Your moth "+name+" and day in it is "+patronymic);
        in.close();
    }
}
