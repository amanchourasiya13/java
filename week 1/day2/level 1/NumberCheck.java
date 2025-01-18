import java.util.Scanner;
public class NumberCheck {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input  two numbers
        System.out.print("Enter number: ");
        int number = input.nextInt();



         // check if number is positive,negative or zero.

         if (number>1){
         System.out.println(" number is positive");                                              
                                                           }
         else if(number<0){
         System.out.println(" Number is negative"); 
                                                              }
         else {
         System.out.println("Number is zero");
              }


        // Close the input
        input.close();
    }
}
