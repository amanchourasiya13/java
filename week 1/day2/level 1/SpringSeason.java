import java.util.Scanner;
public class SpringSeason {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input  month and day 
        System.out.print("Enter month in number: ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();

        // check it is spring season or not.

         if (month>=3 && month<=6 && day>=20){
         System.out.println("It is a spring season "); 
                               }
         else {
         System.out.println("Not a spring season");
              }


        // Close the input
        input.close();
    }
}
