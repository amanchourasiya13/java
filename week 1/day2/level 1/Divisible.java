import java.util.Scanner;
public class Divisible {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input number
        System.out.print("Enter first number: ");
        int number = input.nextInt();

       // check if number is divisible by 5 or not. Moduli operator gives remainder 
         if (number%5==0){
         System.out.println(" number is divisible."); 
                          }
         else {
         System.out.println("Not divisible");
              }

        // Close the input
        input.close();
    }
}
