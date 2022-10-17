package arrays;


import java.util.Arrays;

import java.util.Random;


/**
 * Write a program that does the following(the code should be written in separate methods):
 *
 * Generate an array with 10 elements random between 0 and 99.  (See Random class in Java)
 * Display the generated array.
 * Display only the odd numbers.
 * Display the even numbers.
 *
 */
public class RandomEven {
    public static void main(String[] args) {
        final int min = 0;
        final int max = 99;
        final int arrayLimit = 10;

        int[] array = new int[arrayLimit]; //10 places to store the value

        //Task 1
        for(int i = 0; i < arrayLimit; i++) {
            array[i] = getRandomNumber(min, max);
        }
        displayArray(array);
        displayEven(array);
        displayOdd(array);
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max -  min) + min;
    }

    private static void displayArray(int[] inputArray) {
        System.out.println(Arrays.toString(inputArray));
    }

    /*display array
    print only odd numbers of array
    print only even numbers of array
    call these three matters from the main?
    */
    private static void displayEven(int[] inputArray) {
        System.out.println("Even Numbers:");

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                System.out.println(inputArray[i]);
            }
        }
    }

    private static void displayOdd(int[] inputArray){
        System.out.println("Odd Numbers:");
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0) {
                System.out.println(inputArray[i]);
            }

        }
    }
}

