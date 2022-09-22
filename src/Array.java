/**
 * Examples of Arrays
 * @author carolinrandala
 */
public class Array {

    public static void main(String[] args) {
        int a = 9;

        //this is example of single-diamensional array
        //Note: Array index always starts with 0
        //Infinite array

        //int array
        int[] b = {9, 27, 40, 20, 839, 11000}; //Array can have duplicated values

        //String array
        String[] fruits = {"apple", "orange", "mango", "banana", "watermelon"}; // index= 0, 1, 2

        System.out.println(fruits[0]);
        System.out.println(b[4]);

       //System.out.println(fruits[3]); //Array index out of bound

        System.out.println(b.length); //return the number of values in array

        System.out.println(b.length - 1); //returns array's last index

        //defined array
        int[] veggies = new int[5]; // new object

        veggies[3] = 65;
        veggies[4] = 45;

        System.out.println(veggies[1]);

        String[] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArrey = new int[3];


        //Processing array
        //conventsional for-loop
        for(int i = 0; i < fruits.length; i++) { // i = index of array
            System.out.println(fruits[i]);
        }

        //enhanced for-loop (works only for arrays or list)
        for(String fruit: fruits) {
            System.out.println(fruit);
        }

        //Find the largest element in the array
        //Brute-force method
        int result = b[0]; //result is 9

        for(int x: b) {
            if(x > result){
                result = x;
            }
            }
        System.out.println(result);

        //Homework4
        //To find smallest element in array (b)

        for(int x: b) {
            if(x < result){
                result = x;
            }
    }
        System.out.println(result);
}
}

