import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {

     // Create a input object for user input
        Scanner input = new Scanner(System.in);

        // Input ages of the friends
        System.out.print("Enter Amar's age: ");
        int ageAmar = input.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = input.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = input.nextInt();

        // Input heights of the friends
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = input.nextInt();
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = input.nextInt();
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = input.nextInt();

        // Find the youngest friend
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = (youngestAge == ageAmar) ? "Amar"
                : (youngestAge == ageAkbar) ? "Akbar" : "Anthony";

        // Find the tallest friend
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = (tallestHeight == heightAmar) ? "Amar"
                : (tallestHeight == heightAkbar) ? "Akbar" : "Anthony";

        // Display results
        System.out.println("The youngest friend is: " + youngestFriend + " (Age: " + youngestAge + ")");
        System.out.println("The tallest friend is: " + tallestFriend + " (Height: " + tallestHeight + " cm)");

       //close the input
        input.close();
    }
}
