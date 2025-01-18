import java.util.Scanner;

public class StringToggle{

    // Correct method to toggle case of characters in the string
    public static String StringToggle(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isUpperCase(currentChar)) {  // Check if character is uppercase
                result += Character.toLowerCase(currentChar);  // Convert to lowercase
            } else if (Character.isLowerCase(currentChar)) {  // Check if character is lowercase
                result += Character.toUpperCase(currentChar);  // Convert to uppercase
            } else {
                result += currentChar;  // For non-alphabetic characters, append as is
            }
        }
        return result;  // Return the toggled string
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        // Call the StringToggle method and store the result
        String toggled = StringToggle(str);

        // Print the original and toggled strings
        System.out.print("The original string is: " + str);
        System.out.print("\nThe toggled string is: " + toggled);
    }
}
