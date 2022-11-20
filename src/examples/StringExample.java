package examples;

/**
 * Examples of String
 *
 */
public class StringExample {
    public static void main(String[] args) {
        String firstName = "Carolin";
        String lastName = "Randala";
        String fullName = firstName + lastName; //option 1

        System.out.println(fullName);

        fullName = firstName.concat(lastName); // option 2

        String city = "Tallinn";

        String ageString = "My age is : " + 3 + " . I live in " + city + ". My name is: " + fullName;

        System.out.println(ageString);

        String ageStringFormatted = String.format("My age is : %d. I live in %s. My name is: %s", 3, city, fullName);
        System.out.println(ageStringFormatted);

         //StringBuilder
        //automatically joins to the same variable

        StringBuilder str1 = new StringBuilder("Hello!");
        StringBuilder str2 = str1.append("World");
        System.out.println(str2);

        //need to assign to the variable additionally

        String var1 = "Red";
        var1.concat("Yellow");
        String var2 = "Blue";
        System.out.println(var1);
        System.out.println(var2);


        //Equality
        // ==     ->     This will compare memory references and value
        // string.equals()    ->  compare only the value

        String s1 = "Sibul"; // Pool
        String s2 = "Sibul"; // Pool
        String s3 = new String("Sibul");  // Heap
        String s4 = new String("Sibul");  // Heap

        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        System.out.println(s1.equals(s3));



    }
}
