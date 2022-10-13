package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Create two arrays:
 * gasolineCars
 * electricCars
 *
 * Join the array
 *
 * result would be all cars
 *
 * @author carolinrandala
 */
public class ConcatArrays {
    public static void main(String[] args) {
        String[] gasolineCars = {"Audi A5", "BMW", "Mercedes", "Volvo"};
        String[] electricCars = {"Tesla", "Nissan leaf", "VW UP", "Ford Mustang"};
        List<String[]> allCars = Arrays.asList(gasolineCars, electricCars);

        String[] allcars2 = new String [gasolineCars.length + electricCars.length];
       for(int i = 0; i < gasolineCars.length; i++) {
           allcars2[i] = gasolineCars[i];

       }
       for(int i = 0; i < electricCars.length; i++) {
           allcars2[i + gasolineCars.length] = electricCars[i];
       }
        System.out.println(allCars);
        System.out.println(Arrays.toString(allcars2));
    }

}


