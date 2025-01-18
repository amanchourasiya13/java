import java.util.Scanner;
public class RocketLaunch {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input number
        System.out.print("Enter number : ");
        int number = input.nextInt();

       //Run while loop to check number 

        while(number==1){
        System.out.println("number is "+number+ " Rocket lauch");
        number--;
                }

        // Close the input
        input.close();
    }
}
