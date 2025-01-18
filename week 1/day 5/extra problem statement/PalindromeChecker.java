import java.util.Scanner;

public class PalindromeChecker{

    // Function to take input from the user
    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check if it's a palindrome: ");
        return scanner.nextLine();
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String s) {
        // Remove spaces and convert the string to lowercase for case-insensitive comparison
        String cleanedString = s.replaceAll("\\s+", "").toLowerCase();
        String reversedString = new StringBuilder(cleanedString).reverse().toString();
        return cleanedString.equals(reversedString);
    }

    // Function to display the result
    public static void displayResult(boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("Yes, it's a palindrome!");
        } else {
            System.out.println("No, it's not a palindrome.");
        }
    }

    // Main function that integrates the other functions
    public static void main(String[] args) {
        // Get user input
        String userInput = getInput();
        
        // Check if the string is a palindrome
        boolean result = isPalindrome(userInput);
        
        // Display the result
        displayResult(result);
    }
}
