/**
 * To find second largest element in an Array
 * @author Carolin
 */
public class Exercise6a {
    public static void main(String[] args) {
        int largest = 0;
        int secondLargest = 0;

        int[] array = {1, 7, 3, 10, 9};



        Exercise6b exercise6b = new Exercise6b();
        exercise6b.findSecondLargestElement(array, largest, secondLargest);

        System.out.println("The second largest element in array is: "+ secondLargest);

    }


}
