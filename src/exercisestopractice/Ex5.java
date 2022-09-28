package exercisestopractice;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        //Java program that takes two numbers as input and display the product of two numbers

        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
}
