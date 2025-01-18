import java.util.Scanner;

public class YoungestAndTallestFriends {

    public static void main(String[] args) {
        // Create a input object to take user input
        Scanner input = new Scanner(System.in);

        // Declare arrays to store the ages and heights of the three friends
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input the ages and heights for each friend
        System.out.println("Enter the age and height for Amar:");
        ages[0] = input.nextInt();
        heights[0] = input.nextDouble();

        System.out.println("Enter the age and height for Akbar:");
        ages[1] = input.nextInt();
        heights[1] = input.nextDouble();

        System.out.println("Enter the age and height for Anthony:");
        ages[2] = input.nextInt();
        heights[2] = input.nextDouble();

        // Find the youngest friend
        int youngestAge = ages[0];
        String youngestFriend = "Amar";
        
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                if (i == 1) {
                    youngestFriend = "Akbar";
                } else {
                    youngestFriend = "Anthony";
                }
            }
        }

        // Find the tallest friend
        double tallestHeight = heights[0];
        String tallestFriend = "Amar";

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                if (i == 1) {
                    tallestFriend = "Akbar";
                } else {
                    tallestFriend = "Anthony";
                }
            }
        }

        // Output the results
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " meters.");

        // Close the input
        input.close();
    }
}
