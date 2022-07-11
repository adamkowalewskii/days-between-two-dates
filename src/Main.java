import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoją datę urodzenie w formacie dd-mm-yyyy: ");
        String birthdayDay = scanner.nextLine();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        Date dateOfBirth = format.parse(birthdayDay);
        System.out.println("Data urodzenia: " + dateOfBirth);
        Date currentDate = new Date();
        System.out.println("Aktualna data: " + currentDate);

        long days = currentDate.getTime() - dateOfBirth.getTime();

        System.out.println("Liczba dni pomiedzy: " +TimeUnit.MILLISECONDS.toDays(days));

    }
}