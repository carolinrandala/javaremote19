/**
 * Duplicate values of array (homework5c)
 * @author carolinrandala
 */
public class Homework5c {
    public static void main(String[] args) {

        //Initialize array
        int [] array = new int [] {1, 7, 3, 7, 10, 1, 9};

        System.out.println("Duplicate elements in array: ");

        //Searches for duplicate element
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j])
                    System.out.println(array[j]);
            }
        }
    }
}


