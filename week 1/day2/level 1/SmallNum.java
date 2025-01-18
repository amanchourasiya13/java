import java.util.Scanner;
public class SmallNum {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input  two numbers
        System.out.print("Enter first number: ");
        int numberOne = input.nextInt();

        System.out.print("Enter second number: ");
        int numberTwo = input.nextInt();

        System.out.print("Enter third number: ");
        int numberThree = input.nextInt();
       // check if number is smallest than 3 numbers

         if (numberOne<numberTwo && numberOne<numberThree){
         System.out.println(" NumberOne is smaller than numberTwo and number three"); 
                               }
         else {
         System.out.println("NumberOne is not small then number two and three");
              }


        // Close the input
        input.close();
    }
}
