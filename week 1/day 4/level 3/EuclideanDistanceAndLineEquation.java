import java.util.Scanner;

public class EuclideanDistanceAndLineEquation{

    // Method to calculate the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        // Formula to calculate Euclidean distance: sqrt((x2 - x1)^2 + (y2 - y1)^2)
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to find the equation of the line given two points
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept (b)
        double b = y1 - m * x1;
        
        // Return the slope (m) and y-intercept (b) as an array
        return new double[] {m, b};
    }

    public static void main(String[] args) {
        // create an input object 
        Scanner input = new Scanner(System.in);

        // Input coordinates of the two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Calculate Euclidean distance between the two points
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        // Find the equation of the line passing through the two points
        double[] lineEquation = findLineEquation(x1, y1, x2, y2);
        double slope = lineEquation[0];
        double intercept = lineEquation[1];
        
        // Display the equation of the line in the format y = mx + b
        System.out.println("The equation of the line passing through the points is:");
        System.out.println("y = " + slope + "x + " + intercept);
        
        // close  the input
        input.close();
    }
}
