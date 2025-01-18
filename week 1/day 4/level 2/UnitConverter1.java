public class UnitConverter1 {

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    // Main method to test the UnitConverter utility class
    public static void main(String[] args) {
        // Test conversions
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " kilometers is equal to " + miles + " miles.");

        double milesInput = 6.2;
        double kmResult = convertMilesToKm(milesInput);
        System.out.println(milesInput + " miles is equal to " + kmResult + " kilometers.");

        double meters = 100;
        double feet = convertMetersToFeet(meters);
        System.out.println(meters + " meters is equal to " + feet + " feet.");

        double feetInput = 100;
        double metersResult = convertFeetToMeters(feetInput);
        System.out.println(feetInput + " feet is equal to " + metersResult + " meters.");
    }
}
