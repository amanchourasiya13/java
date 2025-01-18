import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill temperature
    public double calculateWindChill(double temperature, double windSpeed) {

        // Wind chill formula
         double windChill=35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill; 
    }

    public static void main(String[] args) {
        // Create a input object 
        Scanner input = new Scanner(System.in);
  WindChillCalculator obj=new WindChillCalculator();

        // take input temperature and wind speed
        System.out.print("Enter the temperature: ");
        double temperature = input.nextDouble();

        System.out.print("Enter the wind speed: ");
        double windSpeed = input.nextDouble();

        // Display the result
      System.out.println(obj.calculateWindChill(temperature,windSpeed));   
     
        // Close the input
        input.close();
    }
}
