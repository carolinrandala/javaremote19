/**
 * Homework2
 * @author carolinrandala
 */
public class Homework2 {
    public static void main(String[] args) {
        String x = "car";
        String y = "cake";
        String change;

        change = x;
        x = y;
        y = change;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}