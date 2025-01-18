import java.util.Scanner;

public class TemperatureConverter{

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (5.0 / 9.0) * (fahrenheit - 32);
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (9.0 / 5.0) * celsius + 32;
    }

    // Function to take user input
    public static double takeInput(String unit) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in " + unit + ": ");
        return scanner.nextDouble();
    }

    // Function to display the converted temperature
    public static void displayResult(double convertedTemperature, String unit) {
        System.out.println("The converted temperature is: " + convertedTemperature + " " + unit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu for user
        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        System.out.print("Choose an option (1/2): ");
        int choice = scanner.nextInt();

        // Process based on user choice
        if (choice == 1) {
            // Convert from Fahrenheit to Celsius
            double fahrenheit = takeInput("Fahrenheit");
            double celsius = fahrenheitToCelsius(fahrenheit);
            displayResult(celsius, "Celsius");
        } else if (choice == 2) {
            // Convert from Celsius to Fahrenheit
            double celsius = takeInput("Celsius");
            double fahrenheit = celsiusToFahrenheit(celsius);
            displayResult(fahrenheit, "Fahrenheit");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
    }
}
