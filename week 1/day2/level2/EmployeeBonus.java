import java.util.Scanner;

public class EmployeeBonus {

    public static void main(String[] args) {
        // Create a input object
        Scanner input = new Scanner(System.in);

        // Ask the user to input salary and years of service
        System.out.print("Enter the employee's salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter the employee's years of service: ");
        int yearsOfService = input.nextInt();

        // Check if the employee is eligible for a bonus
        if (yearsOfService > 5) {
            // Calculate the bonus as 5% of the salary
            double bonus = salary * 0.05;
            System.out.println("The bonus for this employee is: " + bonus);
        } else {
            System.out.println("This employee is not eligible for a bonus.");
        }

        // Close the input object
        input.close();
    }
}
