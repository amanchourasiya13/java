import java.util.Scanner;

public class Multiplication5 {
    public static void main(String[] args) {

        // Create a input object 
           Scanner input = new Scanner(System.in);

        // Ask the user to input number
        System.out.print("Enter a  number: ");
        int number = input.nextInt();

        // Define an array 
           int[] n = new int[10];
     
//loop the number and store the multiplication in array or save in result

if(number>=6 && number<=9){
            for (int i =1; i<=10; i++){
          int result=number*i;
            n[i-1]=result;

     // Print the multiplication in the format number * i = result
            System.out.println(number + " * " + i + " = " + result);
                              }
                                              }
else{ 
System.out.println("number is not from 6 to 9 table");
 }
      
    }
}
