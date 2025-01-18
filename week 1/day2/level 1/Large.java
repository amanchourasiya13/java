import java.util.Scanner;
public class Large {

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

         // check if first,second or third number is largest of 3 numbers

         if (numberOne>numberTwo && numberOne>numberThree){
         System.out.println(" NumberOne is larger than numberTwo and number three");                                              
                                                           }
         else if(numberTwo>numberOne && numberTwo>numberThree){
         System.out.println(" NumberTwo is larger than numberOne and number three"); 
                                                              }
         else {
         System.out.println("NumberThree is larger then number one and number two");
              }


        // Close the input
        input.close();
    }
}
