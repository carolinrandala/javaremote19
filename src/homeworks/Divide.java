package homeworks;

import java.util.Scanner;

public class Divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers to divide their value");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int value = (a / b);

        System.out.println("Value of the two numbers are: " + value);
    }
}
