import java.util.Scanner;

public class FriendComparison{

    // Method to find the youngest friend
    public static String findYoungest(int[] ages, String[] names) {
        int youngestIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
        }
        return names[youngestIndex];
    }

    // Method to find the tallest friend
    public static String findTallest(double[] heights, String[] names) {
        int tallestIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }
        return names[tallestIndex];
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Taking input for ages and heights
        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height (in cm) of " + names[i] + ": ");
            heights[i] = input.nextDouble();
        }

        // Finding and displaying the youngest and tallest friends
        String youngest = findYoungest(ages, names);
        String tallest = findTallest(heights, names);

        System.out.println("The youngest friend is " + youngest + ".");
        System.out.println("The tallest friend is " + tallest + ".");

        input.close();
    }
}
