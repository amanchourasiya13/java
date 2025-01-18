import java.util.Scanner;
public class Rocket {

    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input number
        System.out.print("Enter number : ");
        int number = input.nextInt();

       //Run while loop to check number 

        for(int i=number;i>=1;i--){
           System.out.println("counter is "+i);
          if(i==1){
           System.out.println("number is "+i+ " Rocket lauch");
                  } 
                     }

        // Close the input
        input.close();
    }
}
