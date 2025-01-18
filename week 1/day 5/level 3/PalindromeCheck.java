import java.util.Scanner;

public class PalindromeCheck{

    // Logic 1: Iterative method to check palindrome
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;  // Return false if characters don't match
            }
            start++;
            end--;
        }
        return true;  // Return true if all characters matched
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;  // Base case: if start index >= end index
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;  // Return false if characters don't match
        }
        return isPalindromeRecursive(text, start + 1, end - 1);  // Recursive call
    }

    // Logic 3: Method using character arrays to check palindrome
    public static boolean isPalindromeCharArray(String text) {
        char[] originalArray = text.toCharArray();
        char[] reverseArray = new char[text.length()];

        // Reverse the string by filling reverseArray
        for (int i = 0; i < text.length(); i++) {
            reverseArray[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare original and reverse arrays
        for (int i = 0; i < text.length(); i++) {
            if (originalArray[i] != reverseArray[i]) {
                return false;  // Return false if characters don't match
            }
        }
        return true;  // Return true if all characters matched
    }

    public static void main(String[] args) {
        // Create scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to input a string
        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        // Checking palindrome using all three methods
        boolean isPalindrome1 = isPalindromeIterative(inputText);
        boolean isPalindrome2 = isPalindromeRecursive(inputText, 0, inputText.length() - 1);
        boolean isPalindrome3 = isPalindromeCharArray(inputText);

        // Displaying the results
        System.out.println("\nPalindrome check results:");
        System.out.println("Using Iterative Method: " + (isPalindrome1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Recursive Method: " + (isPalindrome2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Using Character Array Method: " + (isPalindrome3 ? "Palindrome" : "Not Palindrome"));

        // Close the scanner
        scanner.close();
    }
}
