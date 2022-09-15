/*
*
* @author Carolin Randala
*/
public class Operator {


    public static void main(String[] args) {

        //Unary operators (operator with one variable)
        //post-increment
        int i = 0;
        System.out.println(i);
        System.out.println(i++); // 0 (increment here not used)
        i++; // 1+1 (incremented value plus another increment)
        System.out.println(i);

        // post-decrement
        int y = 0;
        System.out.println(y--);
        System.out.println(y);

        // pre-decrement
        int j = 10;
        System.out.println(j);
        System.out.println(--j);

        // brackets are the highest priority
        int x = i + (-j); // x = i - j; 2 - 9
        System.out.println(x);

        //binary operators (operator with 2 variables)
        //arithmatic operators
        int a = 4;
        int b = 20;
        int c = a + b;
        System.out.println(c);

        int d = a + c * b;
        System.out.println(d);

        int z = j * a + (c / b) - (-j) % x;
        /*
        1. z = 1 * a + (c / b) - (-j) % x;
         */
        System.out.println(z);

        int divide = 40 / 5; // Quotient value
        System.out.println(divide);

        int modulo = 40 % 7; //Reminder value
        System.out.println(modulo);


        // Comparison operators (==, !=, >, <, >=, <=) - can compare only same datatypes
        // Always compare the sama data type
        boolean result = divide == modulo; // 8 == 5
        System.out.println(result);

        boolean result2 = divide != modulo; // 8 (not)! = 5
        System.out.println(result2);

        boolean lessCheck = divide < modulo; // 8 < 5
        System.out.println(lessCheck);

        boolean greaterCheck = divide > modulo; // 8 > 5
        System.out.println(greaterCheck);

        //less than or equals
        boolean lessEquals = divide <= modulo; // 8 <= 5
        System.out.println(lessEquals);

        // logical operators (&&, ||) - and, or
        /*
            true && false = false
            false && true = false
            false && false = false
            true && true = true
         */
        boolean andCheck = (8 < 9) && (10 > 4);
        System.out.println(andCheck);

        /*
           true || true = true
           false || false = false
           true || false = true
           fasle || true = true
         */
        boolean orCheck = (8 > 9) || (10 > 4);
        System.out.println(orCheck);

        // xAnda, XOR
        float expo = 12 ^ 25; // 12 = 00001100, 25 = 00011001
        System.out.println(expo);

        // ternary operators (?, :)
        String ternary = (8 > 10) ? "Cat" : "Dog";
        System.out.println(ternary);

        int ternaryCheck = (x > y) && (a >= b) ? 5 : 1;
        System.out.println(ternaryCheck);

        int check2 = !lessCheck ? 9 : 10;
        System.out.println(check2);

        //number comparison
        boolean checkNumber = 9 == 9.0; // int == float
        System.out.println(checkNumber);
















    }

}
