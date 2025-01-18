import java.util.Scanner;

public class TrigonometricCalculator {

    // Non-static method to calculate sine, cosine, and tangent for a given angle in degrees

    public double[] calculateTrigonometricFunctions(double angle) {
        // Convert angle from degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return the results as an array of doubles
        return new double[] { sine, cosine, tangent };
    }

    public static void main(String[] args) {
        // Create a input object
        Scanner input = new Scanner(System.in);

        // Create an instance of TrigonometricCalculator
        TrigonometricCalculator calculator = new TrigonometricCalculator();

        // Prompt the user to enter an angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = input.nextDouble();

        // Calculate the trigonometric functions for the given angle using the non-static method
        double[] results = calculator.calculateTrigonometricFunctions(angle);

        // Display the results
        System.out.printf("Sine of %.2f degrees: %.4f\n", angle, results[0]);
        System.out.printf("Cosine of %.2f degrees: %.4f\n", angle, results[1]);
        System.out.printf("Tangent of %.2f degrees: %.4f\n", angle, results[2]);

        // Close the input
        input.close();
    }
}
