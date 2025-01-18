import java.util.Scanner;
public class Chocolate {

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input numberOfchocolates and numberOfChildren.

        System.out.print("Enter numberOfchocolates:");
        int numberOfChocolates =input.nextInt();

        System.out.print("Enter numberOfChildren:");
        int numberOfChildren =input.nextInt();

        // Perform the division % operator for get chocolate
        int chocolateGet= numberOfChocolates/ numberOfChildren;
    
        // Perform the moduli % operator for remain chocolate
        int chocolateRemain= numberOfChocolates% numberOfChildren;

        // display the results
        System.out.println("The number of chocolates each child gets is "+chocolateGet+" and the number of remaining chocolates are "+ chocolateRemain);

        // Close the input
        input.close();
    }
}
