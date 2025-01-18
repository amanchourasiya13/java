import java.util.Scanner;

public class TeamBMI{

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI calculation
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] statuses = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmi <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmi <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[][] data = new double[10][3]; // 10 rows for team members, 3 columns for weight, height, BMI

        // Input weight and height for 10 team members
        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Team Member " + (i + 1) + " Weight (kg): ");
            data[i][0] = input.nextDouble();

            System.out.print("Team Member " + (i + 1) + " Height (cm): ");
            data[i][1] = input.nextDouble();
        }

        // Calculate BMI for each member
        calculateBMI(data);

        // Determine BMI statuses
        String[] statuses = determineBMIStatus(data);

        // Display the results
        System.out.println("\nTeam BMI Report:");
        System.out.println("------------------------------------");
        System.out.println("| Member | Weight (kg) | Height (cm) | BMI      | Status       |");
        System.out.println("------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("| %-6d | %-11.2f | %-11.2f | %-8.2f | %-12s |%n",
                              i + 1, data[i][0], data[i][1], data[i][2], statuses[i]);
        }
        System.out.println("------------------------------------");

        input.close();
    }
}
