import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take year as input
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check if the year is valid (greater than or equal to 1582)
        if (year < 1582) {
            System.out.println("The year must be greater than or equal to 1582.");
        } else {
            // Check if the year is a leap year
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }
    }

    // Method to check if the year is a Leap Year
    public static boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4,
        // but not divisible by 100, unless it is also divisible by 400.
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;  // Leap year
        } else {
            return false; // Not a leap year
        }
    }
}
