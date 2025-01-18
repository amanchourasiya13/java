public class OTPGenerator {

    // Method to generate a 6-digit OTP number
    public static int generateOTP() {
        // Generate a random number between 100000 and 999999 (inclusive)
        return (int) (Math.random() * 900000) + 100000;
    }

    // Method to ensure the OTP numbers generated are unique
    public static boolean areOTPsUnique(int[] otpArray) {
        // Loop through the array and compare each OTP with every other OTP
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false;  // If a duplicate is found, return false
                }
            }
        }
        return true;  // If no duplicates are found, return true
    }

    public static void main(String[] args) {
        int[] otpNumbers = new int[10];  // Array to store 10 OTPs

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOTP();
            System.out.println("Generated OTP #" + (i + 1) + ": " + otpNumbers[i]);
        }

        // Check if the OTP numbers are unique
        if (areOTPsUnique(otpNumbers)) {
            System.out.println("\nAll OTP numbers are unique.");
        } else {
            System.out.println("\nDuplicate OTP numbers found.");
        }
    }
}
