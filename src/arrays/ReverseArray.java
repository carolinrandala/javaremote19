package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * To reverse a given array
 *
 * @author carolinrandala
 */
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many array elements?");
        int arrlength = scanner.nextInt();

        System.out.println("Enter array elements one after an other");

        int[] arr = new int[arrlength];
        int[] reverseArr = new int[arrlength];

        for(int i = 0; i < arrlength; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Input array is: " + Arrays.toString(arr));

        int j = 0;
        for(int i = arrlength - 1; i >= 0; i--) {
            reverseArr[j] = arr[i];
            j++;
        }
        System.out.println("Reverse array is:" + Arrays.toString(reverseArr));
    }
}
