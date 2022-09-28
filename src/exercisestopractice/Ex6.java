package exercisestopractice;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        /*
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
         */

        Scanner in = new Scanner(System.in);
        System.out.println("First input number: ");
        int num1 = in.nextInt();

        System.out.println("Second input number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + "+" + num2 + " = " + (num1 + num2));
        System.out.println(num1 + "+" + num2 + " = " + (num1 - num2));
        System.out.println(num1 + "+" + num2 + " = " + (num1 * num2));
        System.out.println(num1 + "+" + num2 + " = " + (num1 / num2));
        System.out.println(num1 + "+" + num2 + " = " + (num1 % num2));



    }
}
