import java.util.Scanner;

public class BMICalculator{

    // Method to calculate BMI and its status based on height (in cm) and weight (in kg)
    public static String[] calculateBMI(double weight, double height) {
        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula: BMI = weight / (height * height)
        double bmi = weight / (height * height);

        // Determine BMI status based on the value of BMI
        String status = "";
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Return an array with BMI and status as strings
        return new String[]{String.valueOf(bmi), status};
    }

    // Method to process the input data (weight and height), calculate BMI, and return a 2D array of the results
    public static String[][] processBMIData(double[][] data) {
        String[][] result = new String[10][4]; // 10 rows for each person, 4 columns (height, weight, BMI, status)
        
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];

            // Calculate BMI and status
            String[] bmiData = calculateBMI(weight, height);
            result[i][0] = String.valueOf(height); // Height (in cm)
            result[i][1] = String.valueOf(weight); // Weight (in kg)
            result[i][2] = bmiData[0]; // BMI
            result[i][3] = bmiData[1]; // Status
        }

        return result;
    }

    // Method to display the 2D array with Height, Weight, BMI, and Status in a tabular format
    public static void displayResults(String[][] results) {
        System.out.println("Person\tHeight (cm)\tWeight (kg)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i+1) + "\t" + results[i][0] + "\t\t" + results[i][1] + "\t\t" + results[i][2] + "\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Changed scanner to input
        
        double[][] weightHeightData = new double[10][2]; // Array to store weight (kg) and height (cm) for 10 people

        // Take user input for weight and height for 10 people
        System.out.println("Enter weight (kg) and height (cm) for 10 people:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Person " + (i + 1) + " - Weight (kg): ");
            weightHeightData[i][0] = input.nextDouble();  // Reading weight

            System.out.print("Person " + (i + 1) + " - Height (cm): ");
            weightHeightData[i][1] = input.nextDouble();  // Reading height
        }

        // Process the data to calculate BMI and status
        String[][] results = processBMIData(weightHeightData);

        // Display the results in tabular format
        displayResults(results);

        input.close();  // Close the input object
    }
}
