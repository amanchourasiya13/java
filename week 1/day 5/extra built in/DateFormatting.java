import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {
    public static void main(String[] args) {
        // Create a Date object for the current date and time
        Date currentDate = new Date();

        // Define the date formats
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format3 = new SimpleDateFormat("EEE, MMM dd, yyyy");

        // Display the current date in three different formats
        System.out.println("Format 1 (dd/MM/yyyy): " + format1.format(currentDate));
        System.out.println("Format 2 (yyyy-MM-dd): " + format2.format(currentDate));
        System.out.println("Format 3 (EEE, MMM dd, yyyy): " + format3.format(currentDate));
    }
}
