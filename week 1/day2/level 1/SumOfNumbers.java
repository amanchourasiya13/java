import java.util.Scanner;
public class  SumOfNumbers{

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input number
        System.out.print("Enter number  : ");
       double  number = input.nextDouble();

        double sum=0;
      
       // while loop to check number is 0 

        while(number!=0){
          System.out.print("input again");
         number = input.nextDouble();
         sum += number;
                     }
      System.out.println("your sum is:"+sum);

        // Close the input
        input.close();
    }
}
