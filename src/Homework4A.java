/**
 * Homework4a
 * @author carolinrandala
 */
public class Homework4A {
    public static void main(String[] args) {

        int a = 9;
        int[] b = {9, 27, 40, 20, 839, 11000};

        int result = b[0];

        for(int x: b) {
            if(x < result){
                result = x;
            }
        }
        System.out.println(result);

}
}

