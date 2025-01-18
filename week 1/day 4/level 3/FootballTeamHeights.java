import java.util.Scanner;
import java.util.Random;

public class FootballTeamHeights{
    
    // Method to find the sum of all elements in the array
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to find the mean height of the players
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        
        // Create an array for the heights of 11 players
        int[] heights = new int[11];

        // Populate the heights array with random values between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // Random value between 150 and 250
        }
        
        // Display the heights of all players
        System.out.println("Heights of the football team players (in cms):");
        for (int height : heights) {
            System.out.println(height);
        }
        
        // Calculate and display the sum, mean, shortest, and tallest heights
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Sum of heights: " + sum + " cms");
        System.out.println("Mean height: " + mean + " cms");
        System.out.println("Shortest height: " + shortest + " cms");
        System.out.println("Tallest height: " + tallest + " cms");
        
        // close the input
        input.close();
    }
}
