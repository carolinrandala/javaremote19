public class Homework4b {
    public static void main(String[] args) {

        //To calculate average value of array elements
        int[] array = {1, 7, 3, 10, 9};
        //getting array length
        int length = array.length;
        System.out.println(array.length);
        //default sum value
        int sum = 0;

        //sum of all values in array using for loop
        for(int i = 0 ; i < array.length; i++){
            sum += array[i];
        }
        double average = sum / length;
        System.out.println("Average of array : " +average);

        //Loop through the array in reverse order

        for (int i = array.length-1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
    }

