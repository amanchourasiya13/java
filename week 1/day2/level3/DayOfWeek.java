import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
 
        // Create a input object for user input
           Scanner input = new Scanner(System.in);

       // Take input for month, day, and year
        System.out.print("Enter the month (1 for January, 2 for February, ...): ");
        int m = input.nextInt();
        System.out.print("Enter the day of the month: ");
        int d = input.nextInt();
        System.out.print("Enter the year: ");
        int y = input.nextInt();
        
        // Apply the formula for Gregorian calendar
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // display the result
        System.out.println("The day of the week is: " + d0);
        
        //close the  input
        input.close();
    }
}
