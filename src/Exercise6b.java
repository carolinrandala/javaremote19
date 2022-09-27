/**
 * To find second largest element in an Array
 * @author Carolin
 */
public class Exercise6b {
    public int findSecondLargestElement(int[] array, int largest, int secondLargest){
        int result = array[0];


        for (int i = 0; i < array.length; i++) {

            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest) {
                secondLargest = array[i];

            }
        }
        return result;
    }
}



