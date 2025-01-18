import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char playAgain;

        do {
            // Initialize the range for the number
            int lowerBound = 1;
            int upperBound = 100;
            
            System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
            System.out.println("For each guess, please respond with 'h' if my guess is too high, 'l' if it's too low, or 'c' if I guessed correctly.");
            
            boolean isGuessed = false;
            while (!isGuessed) {
                // Generate and guess the number
                int guess = generateGuess(lowerBound, upperBound);
                System.out.println("Is the number " + guess + "?");
                
                // Get feedback from the user
                char feedback = getFeedback(scanner);
                
                // Process feedback to adjust the guess range
                if (feedback == 'h') {
                    upperBound = guess - 1;
                } else if (feedback == 'l') {
                    lowerBound = guess + 1;
                } else if (feedback == 'c') {
                    System.out.println("Yay! I guessed the correct number: " + guess);
                    isGuessed = true;
                } else {
                    System.out.println("Invalid input! Please respond with 'h', 'l', or 'c'.");
                }
            }
            
            // Ask the user if they want to play again
            System.out.println("Do you want to play again? (y/n): ");
            playAgain = scanner.next().charAt(0);
        } while (playAgain == 'y' || playAgain == 'Y');
        
        System.out.println("Thanks for playing! Goodbye.");
        scanner.close();
    }
    
    // Function to generate a random guess within the given range
    public static int generateGuess(int lowerBound, int upperBound) {
        Random rand = new Random();
        return rand.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }

    // Function to get the feedback from the user
    public static char getFeedback(Scanner scanner) {
        System.out.println("Enter feedback (h for too high, l for too low, c for correct): ");
        return scanner.next().charAt(0);
    }
}
