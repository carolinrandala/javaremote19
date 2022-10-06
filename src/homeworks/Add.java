package homeworks;

import java.util.Scanner;

/**
 * Homework using Addnumbers method
 */
public class Add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the two numbers for addtion:");
        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        scanner.close();

        System.out.println("The value of numbers are: " + Integer.sum(numberOne, numberTwo));

    }

}
