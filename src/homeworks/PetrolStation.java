package homeworks;


import java.util.Scanner;

/**
 * Petrol Station
 * Simulate the process of refueling. Within the while loop ask user if you should continue or finish. For every entered “continue” command you should add a specific amount of petrol and money (both of type double) and view it on the console.
 * At the end user should pay for petrol. Consider multiple possibilities, like:
 * The user paid exactly as much as required.
 * The user paid too much (cashier should return the rest of the money).
 * The user paid too little – should be asked for the rest.
 */
public class PetrolStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double thresholdPetrol = 5;
        final double pricePerLitre = 2.199;

        System.out.println("Petrol refilling");

        //Within the while loop ask user if you should continue or finish.
        System.out.println("Would you like to continue or finish?");
        boolean isContinue = scanner.nextBoolean();
        boolean finish = scanner.hasNextBoolean();
        double totalLitres = 0;
        double totalAmount = 0;
        isContinue = scanner.nextBoolean();

        while (isContinue) {
            totalLitres += thresholdPetrol;
            totalAmount = totalLitres * pricePerLitre;
            System.out.println("Total litres filled:" + totalLitres);

            if(finish) {
                System.out.println("Total amount:" + totalAmount + " €");
            }




        }



        }

    }















