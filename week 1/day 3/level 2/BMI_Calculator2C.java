import java.util.Scanner;

public class BMI_Calculator2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Create a 2D array to store weight, height, and BMI for all persons
        double[][] personData = new double[numberOfPersons][3]; // [i][0] = weight, [i][1] = height, [i][2] = BMI
        String[] weightStatus = new String[numberOfPersons];

        // Input weight, height and calculate BMI for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1));

            // Get weight and ensure it's a positive value
            double weight;
            do {
                System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                weight = input.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be positive. Please enter a valid weight.");
                }
            } while (weight <= 0);
            personData[i][0] = weight;

            // Get height and ensure it's a positive value
            double heightInCm;
            do {
                System.out.print("Enter height (in cm) for person " + (i + 1) + ": ");
                heightInCm = input.nextDouble();
                if (heightInCm <= 0) {
                    System.out.println("Height must be positive. Please enter a valid height.");
                }
            } while (heightInCm <= 0);
            personData[i][1] = heightInCm;

            // Convert height from cm to meters
            double heightInMeters = heightInCm / 100;

            // Calculate BMI using the formula: BMI = weight / (height * height)
            double bmi = weight / (heightInMeters * heightInMeters);
            personData[i][2] = bmi;

            // Determine the weight status based on BMI
            if (bmi <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display the height, weight, BMI, and status of each person
        System.out.println("\nPerson Details:");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.println("Weight: " + personData[i][0] + " kg");
            System.out.println("Height: " + personData[i][1] + " cm");
            System.out.println("BMI: " + String.format("%.2f", personData[i][2]));
            System.out.println("Status: " + weightStatus[i]);
        }

        // Close the input
        input.close();
    }
}
