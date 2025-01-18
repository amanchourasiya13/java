import java.util.Scanner;

public class CollinearityCheck{

    // Method to check if three points are collinear using the slope formula
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Slope of AB = (y2 - y1) / (x2 - x1)
        // Slope of BC = (y3 - y2) / (x3 - x2)
        // Slope of AC = (y3 - y1) / (x3 - x1)
        
        // To avoid division by zero and to avoid floating-point precision issues,
        // we will cross-multiply to check if slopes are equal.
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check if three points are collinear using the area of the triangle formula
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Area of triangle formed by points (x1, y1), (x2, y2), (x3, y3)
        // area = 0.5 * |x1(y2 - y3) + x2(y3 - y1) + x3(y1 - y2)|
        
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        
        // If the area is 0, the points are collinear
        return area == 0;
    }

    public static void main(String[] args) {
        // create an input object.
        Scanner input = new Scanner(System.in);

        // Taking input for three points A(x1, y1), B(x2, y2), and C(x3, y3)
        System.out.print("Enter coordinates for point A (x1, y1): ");
        int x1 = input.nextInt();
        int y1 = input.nextInt();
        
        System.out.print("Enter coordinates for point B (x2, y2): ");
        int x2 = input.nextInt();
        int y2 = input.nextInt();
        
        System.out.print("Enter coordinates for point C (x3, y3): ");
        int x3 = input.nextInt();
        int y3 = input.nextInt();

        // Check if the points are collinear using slope formula
        if (areCollinearBySlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear based on the slope formula.");
        } else {
            System.out.println("The points are not collinear based on the slope formula.");
        }

        // Check if the points are collinear using area formula
        if (areCollinearByArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points are collinear based on the area formula.");
        } else {
            System.out.println("The points are not collinear based on the area formula.");
        }

        // close the input
        input.close();
    }
}
