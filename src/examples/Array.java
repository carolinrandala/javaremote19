package examples;

/**
 * Examples of Arrays
 * @author carolinrandala
 */
public class Array {

    public static void main(String[] args) {
        int a = 9;

        //this is example of single-diamensional array
        //Note: examples.Array index always starts with 0
        //Infinite array

        //int array
        int[] b = {9, 27, 40, 20, 839, 11000}; //examples.Array can have duplicated values

        //String array
        String[] fruits = {"apple", "orange", "mango", "banana", "watermelon"}; // index= 0, 1, 2

        System.out.println(fruits[0]);
        System.out.println(b[4]);

       //System.out.println(fruits[3]); //examples.Array index out of bound

        System.out.println(b.length); //return the number of values in array

        System.out.println(b.length - 1); //returns array's last index

        //defined array
        int[] veggies = new int[5]; // new object

        veggies[3] = 65;
        veggies[4] = 45;

        System.out.println(veggies[1]);

        String[] food = new String[] {"cake", "porridge", "rice"};

        int[] ageArrey = new int[3];


        //Processing array elements
        //conventsional for-loop
        for(int i = 0; i < fruits.length; i++) { // i = index of array
            System.out.println(fruits[i]);
        }

        //enhanced for-loop (works only for arrays or list)
        for(String fruit: fruits) { //String : String[]
            System.out.println(fruit);
        }

        //Find the largest element in the array
        //Brute-force method
        int result = b[0]; //result is 9

        for(int x: b) {
            if(x > result){
                result = x;
            }
            }
        System.out.println(result);


        //Multi-dimentional array
        //2D array
        int[][] array2d = new int[3][3];
        //Row- 1
        array2d[0][0] = 1;
        array2d[0][1] = 0;
        array2d[0][2] = 1;
        //Row-2
        array2d[1][0] = 2;
        array2d[1][1] = 10;
        array2d[1][2] = 9;
        //Row-3
        array2d[2][0] = 4;
        array2d[2][1] = 9;
        array2d[2][2] = 8;

        int[][] array2dVer2 = {{1, 0, 1}, {2, 10, 9}, {4, 9, 8}};

        //sout.print- prints in the same line
        for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
                System.out.print(array2dVer2[x][y] + " "); //here use print instead of println
            }
            System.out.println();
        }

        //3D array = 1D + 2D
        //1D => number of tables
        //2D array => array with rows and colums

        int[][][] array3d = new int[3][3][3];
        //Table-1
        //Row-1
        array3d[0][0][0] = 1;
        array3d[0][0][1] = 0;
        array3d[0][0][2] = 1;

        int[][][] array3dVer2 = {
                                {{1, 0, 1},{1, 8, 0},{2, 5, 7}},
                                {{9, 8, 7},{5, 8, 9},{3, 5, 0}},
                                {{6, 6, 2}, {4, 5, 7}, {2, 6, 8}},
                                };

        //print 3D array
            for(int x = 0; x < 3; x++){
            for(int y = 0; y < 3; y++){
            for(int z = 0; z < 3; z++){
                System.out.print(array3dVer2[x][y][z] + "\t");
    }
                System.out.println();
        }
                System.out.println("\n");

}
}}


