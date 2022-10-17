package arrays;

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
    }

    private static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max -  min) + min;
    }

    //Display array

    //To print only odd numbers of array

    //to print even numbers of array
}
