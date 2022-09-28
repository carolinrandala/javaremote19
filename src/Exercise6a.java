/**
 * To find second largest element in an Array
 * @author Carolin
 */
public class Exercise6a {
    public static void main(String[] args) {
        int[] b = {1, 7, 3, 10, 9};


        Exercise6b exercise6b = new Exercise6b();
        int result = exercise6b.findSecondLargestElement(b);


        System.out.println("The second largest element in array is: "+ result);

    }


}
