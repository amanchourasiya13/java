import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner input = new Scanner(System.in);
        
        // user to enter a sentence
        System.out.print("Enter a sentence: ");
        String str = input.nextLine();
        
        // Split the sentence into words using space as delimiter
        String[] words = str.split("\\s+");
        
        // Initialize a variable to store the longest word
        String longestWord = "";
        
        // Loop through all words to find the longest one
        for (String word : words) {
            // If the current word is longer than the previously stored longest word
            if (word.length() > longestWord.length()) {
                longestWord = word; // Update the longest word
            }
        }
        
        // Output the longest word
        System.out.println("The longest word is: " + longestWord);
    }
}
