import java.util.Scanner;

public class CalendarDisplay{

    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];  // Return the month name based on the month number
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if divisible by 4, but not 100 unless also divisible by 400
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get the number of days in a given month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Days in each month for non-leap years
        if (month == 2 && isLeapYear(year)) {
            return 29;  // February has 29 days in a leap year
        }
        return daysInMonth[month - 1];  // Return days for the given month
    }

    // Method to calculate the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (1 + x + (31 * m0) / 12) % 7;
        return d0;  // Return the day of the week (0 = Sunday, 1 = Monday, etc.)
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);  // Get the name of the month
        int daysInMonth = getNumberOfDays(month, year);  // Get the number of days in the month
        int firstDay = getFirstDayOfMonth(month, year);  // Get the first day of the month

        // Display the header with the month and year
        System.out.println("\n     " + monthName + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Print leading spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("   ");  // Print spaces for days before the first day
        }

        // Print the days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);  // Print each day, with a width of 2 for alignment
            if ((firstDay + day) % 7 == 0) {
                System.out.println();  // Start a new line after Saturday
            }
        }

        // Print a newline at the end if the calendar doesn't end with Saturday
        if ((firstDay + daysInMonth) % 7 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Display the calendar for the given month and year
        displayCalendar(month, year);

        // Close the scanner
        scanner.close();
    }
}
