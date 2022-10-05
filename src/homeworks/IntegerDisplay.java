package homeworks;

import java.util.Scanner;

/**
 * To read a number from user and print the same number like this:
 *
 *If Given number 4, then print:
 * 4, 44, 444, 4444
 *
 * @author carolinrandala
 */
public class IntegerDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();


        for(int i = 1; i <= 4; i++) {
            for(int j = 0; j < i; j++){
                System.out.print(number);
            }
            System.out.println();
        }
    }
}
