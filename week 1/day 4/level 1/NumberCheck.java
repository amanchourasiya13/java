import java.util.Scanner;
public class NumberCheck {

int check(int number){

         // check if number is positive,negative or zero.

         if (number<0){
           return -1;                                              
                  }
         else if(number==0){
            return 0;
                   }
     else 
     return 1;

}
    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input  two numbers
        System.out.print("Enter number: ");
        int number = input.nextInt();

      // create an obj object 
       NumberCheck obj=new NumberCheck();

       //display the result or call method
           System.out.print(obj.check(number));         

        // Close the input
        input.close();
    }
}
