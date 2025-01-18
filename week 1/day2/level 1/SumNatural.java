import java.util.Scanner;
public class SumNatural {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input  two numbers
        System.out.print("Enter positive integer number: ");
        int number = input.nextInt();

        // check if number is smallest than 3 numbers

         if (number>=1){
          int sum= number*(number+1)/2;
         System.out.println("sum of "+ number +" natural number is: "+ sum); 
                               }
         else {
         System.out.println("NumberOne is not natural number .");
              }


        // Close the input
        input.close();
    }
}
