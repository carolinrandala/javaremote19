package calculator;


public class Add {
    public int addArray(int[] arr) {
        int result = 0;
        for(int input : arr) {
            result += input;
        }

        return result;

    }

}
