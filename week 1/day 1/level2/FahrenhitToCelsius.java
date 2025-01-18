import java.util.Scanner;
public class FahrenhitToCelsius {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input Fahrenhit
        System.out.print("Enter Celsius: ");
        float fahrenhit = input.nextFloat();

        //Calculate the  Fahrenheit to Celsius :   (°F − 32) x 5/9 = °C 
        float celsiusResult=(fahrenhit-32)*5/9;

        //display the result
        System.out.println("The temperature in  fahreheit to celsius is: "+ celsiusResult);

        // Close the input
        input.close();
    }
}
