package basics;

import java.util.Scanner;

/**
 * To read two numbers from the user, add and print the result of sum
 *
 * @author carolinrandala
 */
public class InputSum {
    public static void main(String[] args) {

        //To get input
        Scanner in = new Scanner(System.in);

        System.out.println("Input first number: ");
        int num1 = in.nextInt();

        System.out.println("Input second number: ");
        int num2 = in.nextInt();

        //Sum
        int sum = num1 + num2;
        System.out.println("Sum is:" + sum);


    }
}
