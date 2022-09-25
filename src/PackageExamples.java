import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Random;
/**
 * Example of package in Java
 * @author carolinrandala
 */

public class PackageExamples {
    public static void main(String[] args) {
    Random random = new Random();

    System.out.println(random.nextInt());

    Date date = new Date();
    System.out.println(date);

    LocalDate localDate = LocalDate.now();
    System.out.println(localDate);

    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    LocalDate myBirthday = LocalDate.of(2022, 2, 8);
    System.out.println(myBirthday);

    LocalTime localTime = LocalTime.MIDNIGHT;
    System.out.println(localTime);
}
}


