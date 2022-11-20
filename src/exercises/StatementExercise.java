package exercises;

public class StatementExercise {
    public static void main(String[] args) {

        //if
        //Write a Java program to find if person is an adult

        int myAge = 21;

        if(myAge >= 18){
            System.out.println("The person is an adult");
        }

        //if- else
        //Write a Java progam to print if the given number is odd or even
        int number = 2020;

        if(number % 2 == 0){
            System.out.println("This is an even number");
        } else {
            System.out.println("This is a odd number");
        }

        //if, else-if, else
        //Write a Java program to print if the string is empty. If the lenght is greeater than 20 and if the string is null

        String test = "";

        if(test == ""){
            System.out.println("The given String is empty");
        } else if (test.length() > 20) {
            System.out.println("The given String is so long");
        } else if (test.length() < 20 ) {
            System.out.println("The given String is too short");
        } else if (test == null) {
            System.out.println("The String cannot be null");
        }

        //Switch
        //Write a Java program to match the given alphabet

        char test2 = 'A';

        switch (test2) {
            case 'A':
                System.out.println("It is A");
                break;
            case 'B':
                    System.out.println("It is B");
                    break;
            case 'C':
                    System.out.println("It is C");
                    break;
            default:
                System.out.println("Is not found");
        }
        // Write a Java program to print all the odd numbers from 1 to 50.

        int k = 100;

        System.out.println("Ood numbers from 1 to " + k + "are: ");
        for (int i = 1; i <= k; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }


    }
}
