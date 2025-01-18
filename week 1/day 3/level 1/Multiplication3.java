import java.util.Scanner;

public class Multiplication3 {
    public static void main(String[] args) {

        // Create a input object 
           Scanner input = new Scanner(System.in);

        // Ask the user to input number
        System.out.print("Enter a  number: ");
        int number = input.nextInt();

        // Define an array 
           int[] n = new int[10];
     
//loop the number and store the multiplication in array or save in result
            for (int i =1; i<=10; i++) ;
          int result=number*i;
            n[i-1]=result;
     // Print the multiplication in the format number * i = result
            System.out.println(number + " * " + i + " = " + result);
                                               } 
        // Close the input object
            input.close();
    }
}
