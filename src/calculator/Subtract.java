package calculator;



public class Subtract {
    public int subtractArray(int[] arr) {
        int result = arr[0];
        for(int i = 1; i < arr.length; i++) {
            result = result - arr[i];
        }

        return result;
    }
}
