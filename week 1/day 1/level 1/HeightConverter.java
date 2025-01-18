import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Create scanner object to read user input
        Scanner input = new Scanner(System.in);

        //  user to enter height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = input.nextDouble();

        // Convert centimeters to inches (1 inch = 2.54 cm)
        double heightInInches = heightInCm / 2.54;

        // Calculate the number of feet
        int feet = (int) heightInInches / 12;

        // Display the result
        System.out.println("Your height in cm is "+heightInCm +" while in feet is "+ feet +" and inches is " + heightInInches);

        // Close the scanner
        input.close();
    }
}
