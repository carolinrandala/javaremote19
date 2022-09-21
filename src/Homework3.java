/**
 * Homework3
 * @author carolinrandala
 */
public class Homework3 {
    public static void main(String[] args) {
        //Solution 2
        //Homework: one line solution for FIZZBUZZ

        int j = 15;

        System.out.println(j % 3 == 0 && j % 5 == 0? "fizzbuzz " : ((j % 3 == 0) ? "fizz " : ((j % 5 == 0) ? "buzz " : j + "")));
    }
}