package strings;

/**
 * To print substring of a string
 *
 * @author carolinrandala
 */
public class SubstringPrint {
    public static void main(String[] args) {
        String s = "Estonia is a beautiful country!"; //reading from 0 until the end
        System.out.println(s);

        System.out.println(s.substring(0, 22));
        System.out.println(s.substring(23));

        System.out.println(s.substring(13,22));
        System.out.println(s.substring(0,13) + s.substring(23));

        System.out.println(s.substring(s.indexOf("beautiful"))); //getting index of word beautiful

        System.out.println(s.startsWith("Estonia")); //to check if it starts with this word
    }
}
