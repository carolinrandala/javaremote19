package homeworks;

import java.util.Scanner;

public class Multiply {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers to multiply:");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int value = (a * b);

        System.out.println("The value of the two numbers are: " + value);
    }
}
