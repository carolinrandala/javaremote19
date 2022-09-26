/**
 * Exercise
 *
 * @author carolinrandala
 */
public class Algorithm {
    // Odd or even
    // solution 1 - if else
    public static void main(String[] args) {
        int a;
        for(a = 0; a <= 20; a++){
        if (a % 2 == 0) {
            System.out.println("is even");
        } else  {
            System.out.println("is odd");
    }
}      // solution 2 - using ternary operator
        for (a = 0; a <= 20; a++){
            System.out.println(a + "is" + (a % 2 == 0 ? "even" : "odd") + "number"); // a is even/odd
        }

        //Leap year
        int year = 2022;
        // solution 1
        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
            System.out.println(year + "is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        // solution 2
        System.out.println(year + " is" + (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ? " " : " not ") + "a leap year");

        //solution 3- simple!
        if(year % 4 == 0){
            System.out.println("This is a leap year");
        } else {
                System.out.println("not leap year");
            }

        //FIZZBUZZ
        // solution1
        int j= 15;

        if(j % 3 == 0){
            System.out.println("FIZZ");
        }else if(j % 5 == 0){
            System.out.println("BUZZ");
    } else if(j % 3 == 0 && j % 5 == 0){
            System.out.println("FIZZBUZZ");
        }

        //Solution 2
        //Homework: one line solution for FIZZBUZZ
}
}
