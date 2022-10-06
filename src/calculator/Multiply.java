package calculator;



public class Multiply {
    public int multiplyArray(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            result = result * arr[i];
        }

        return result;
    }
}
