import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Input: Base and Height of the triangle in inches
        System.out.print("Enter the base of the triangle (in inches): ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle (in inches): ");
        double height = input.nextDouble();

        // Calculate the area of the triangle in square inches
        double areaInInches = 0.5 * base * height;
        
        // Convert area to square centimeters (1 square inch = 6.4516 cm^2)
        double areaInCm = areaInInches * 6.4516;

        // Convert height from inches to centimeters, feet, and inches
        double heightInCm = height * 2.54;
        double heightInFeet = height / 12;
        int heightInInches = (int) height;

        // Output the result
        System.out.println("Area of the triangle in square inches: " + areaInInches+" In square centimeters: " + areaInCm);
        System.out.println("Your Height in cm is :"+heightInCm+" while in feet is "+heightInFeet+" and in inches is "+heightInInches);

        // close the input
        input.close();
    }
}
