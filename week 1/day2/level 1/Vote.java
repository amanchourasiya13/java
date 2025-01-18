import java.util.Scanner;
public class Vote {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input age
        System.out.print("Enter your age : ");
        int age = input.nextInt();

        // check if  age is greater than 18 or not. 
         if (age>=18){
         System.out.println(" The person can vote"); 
                          }
         else {
         System.out.println("The person cannot the vote");
              }

        // Close the input
        input.close();
    }
}
