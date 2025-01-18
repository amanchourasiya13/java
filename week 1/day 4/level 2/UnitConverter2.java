public class UnitConverter2 {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333;
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    // Test conversions
        double yards = 10;
        double feetResult = convertYardsToFeet(yards);
        System.out.println(yards + " yards is equal to " + feetResult + " feet");

        double feet = 6.2;
        double yardResult = convertFeetToYards(feet);
        System.out.println(feet + " feet is equal to " + yardResult + " yards.");

        double meters = 100;
        double incheMeter = convertMetersToInches(meters);
        System.out.println(meters + " meters is equal to " + incheMeter + " inches");

        double inches= 100;
        double inchMeter = convertInchesToMeters(inches);
        System.out.println(inches + " inches is equal to " + inchMeter + " meters.");

  // double inches= 100;
        double inchCm  = convertInchesToCentimeters(inches);
        System.out.println(inches + " inches is equal to " + inchCm+ " centimeters.");


    }
}
