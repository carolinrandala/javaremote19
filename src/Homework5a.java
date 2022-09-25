/**
 * Homework 5a (printing out all odd numbers from an array)
 * @author carolinrandala
 */
public class Homework5a {
    public static void main(String[] args) {

        int a[]={1, 7, 3, 10, 9};
        System.out.println("Odd Numbers:");

        for(int i=0;i<a.length;i++){
            if(a[i]%2!=0){

                System.out.println(a[i]);
            }
        }
    }
}
