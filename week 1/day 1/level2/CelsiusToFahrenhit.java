import java.util.Scanner;
public class CelsiusToFahrenhit {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input Celsius
        System.out.print("Enter Celsius: ");
        float celsius = input.nextFloat();

        //Calculate the celcius to Fahrenheit :   (°C × 9/5) + 32 = °F
        float fahrenhitResult=(celsius*9/5)+32;

        //display the result
        System.out.println("The temperature in Celsius to fahreheit is: "+ fahrenhitResult);

        // Close the input
        input.close();
    }
}
