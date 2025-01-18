import java.util.Scanner;

public class LowerCase{

    // Method to convert uppercase to lowercase using ASCII values
    public static String convertToLowerCaseUsingCharAt(String str) {
        String result = "";  // Initialize an empty string to store the result
        
        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase using ASCII value difference
                ch = (char)(ch + 32);
            }
            result += ch;  // Append the character to the result string
        }
        
        return result;
    }

    // Method to convert uppercase to lowercase using built-in method
    public static String convertToLowerCaseUsingBuiltIn(String str) {
        // Use the built-in toLowerCase() method to convert the string to lowercase
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Convert using both methods
        String lowerUser = convertToLowerCaseUsingCharAt(str);
        String lowerBuilt = convertToLowerCaseUsingBuiltIn(str);

        // Display the converted results
        System.out.println("Converted using charAt method: " + lowerUser);
        System.out.println("Converted using built-in method: " + lowerBuilt);

        // Compare the two results
        if (lowerUser.equals(lowerBuilt)) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("The results are different.");
        }

        input.close();
    }
}
