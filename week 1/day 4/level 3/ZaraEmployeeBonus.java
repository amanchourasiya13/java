import java.util.Random;

public class ZaraEmployeeBonus{

    // Method to generate the salary and years of service for 10 employees
    public static int[][] generateEmployeeData() {
        Random rand = new Random();
        int[][] employeeData = new int[10][2];  // Array to store [salary, years_of_service] for each employee

        for (int i = 0; i < 10; i++) {
            // Generate a random salary between 10000 and 99999 (5-digit salary)
            employeeData[i][0] = 10000 + rand.nextInt(90000);
            // Generate years of service between 1 and 20 years
            employeeData[i][1] = 1 + rand.nextInt(20);
        }
        return employeeData;
    }

    // Method to calculate the new salary and bonus based on the given logic
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] updatedData = new double[10][3];  // Array to store [old salary, new salary, bonus] for each employee

        for (int i = 0; i < 10; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
av
            // Calculate the bonus and new salary based on years of service
            double bonusPercentage = (yearsOfService > 5) ? 0.05 : 0.02;
            double bonus = oldSalary * bonusPercentage;
            double newSalary = oldSalary + bonus;

            // Store the old salary, new salary, and bonus
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }
        return updatedData;
    }

    // Method to calculate and display the total old salary, new salary, and total bonus
    public static void displayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("Employee\tOld Salary\tNew Salary\tBonus");
        System.out.println("------------------------------------------------");

        // Iterate over the employee data to calculate totals and print individual details
        for (int i = 0; i < 10; i++) {
            double oldSalary = updatedData[i][0];
            double newSalary = updatedData[i][1];
            double bonus = updatedData[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            // Print individual employee details
            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f\n", (i+1), oldSalary, newSalary, bonus);
        }

        // Print the total values
        System.out.println("------------------------------------------------");
        System.out.printf("Total Old Salary: %.2f\n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f\n", totalNewSalary);
        System.out.printf("Total Bonus Paid: %.2f\n", totalBonus);
    }

    public static void main(String[] args) {
        // Generate employee data (salary and years of service)
        int[][] employeeData = generateEmployeeData();

        // Calculate the bonus and new salary for each employee
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);

        // Display the total values and employee data in a tabular format
        displayTotals(updatedData);
    }
}
