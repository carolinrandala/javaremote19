package homeworks;


import java.util.Scanner;

public class PetrolStation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayPetrolStationmainMenu();
    }

    private static int displayPetrolStationmainMenu() {
        System.out.println("WELCOME TO THE PETROL STATION!");
        System.out.println("Would you like to:");
        System.out.println("1. Refuel \n2. Pay \n3. Exit");
        return getMenuOption(3);
    }

    private static int getMenuOption(int limit) {
        Scanner scanner = new Scanner(System.in);
        String errorMessage = "Incorrect option! Please enter again:";
        int option = limit + 1;
        do {
            if (!scanner.hasNextInt()) {
                System.out.println(errorMessage);
                scanner.next();
            } else {
                option = scanner.nextInt(); // correct input
                if (option > limit) {
                    System.out.println(errorMessage);
                }
            }
        } while (option > limit);
       return option;
    }





    }







