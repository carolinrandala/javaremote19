package basics;

import java.util.Scanner;

/**
 * To calculate area and perimeter of a circle
 * Area = Pi r sq
 * Perimeter = 2 Pi r
 *
 * @author carolinrandala
 */
public class Perimeter {
    public static void main(String[] args) {
        final float pi = 3.14f; // "final" keyword means constant value
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        float radius = scanner.nextFloat();

        //Area
        float area = pi * (radius * radius);

        //Perimeter (Circumference)
        float perimeter = 2 * pi * radius;

        System.out.println("Area:" + area);
        System.out.println("Perimeter" + perimeter);

    }
}
