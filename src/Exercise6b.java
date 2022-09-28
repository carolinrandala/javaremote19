/**
 * To find second largest element in an Array
 * @author Carolin
 */
public class Exercise6b {
    public int findSecondLargestElement(int[] array){
        int result = array[0];


        for (int x : array) {
            if(x > result) {
                result = x - 1;
            }
        }
        return result;
    }
}



