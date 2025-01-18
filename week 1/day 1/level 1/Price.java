import java.util.Scanner;
public class Price{
public static void main(String[]args){
  // Create input object to read user input
        Scanner input=new Scanner(System.in);

  //  user to enter  unit price and quantity
        System.out.print("Enter unitPrice ");
        double unitPrice=input.nextDouble();

        System.out.print("Enter quantity ");
        double quantity=input.nextDouble();

  // calculate total price
        double totalPrice= unitPrice*quantity;

  // Display the result
        System.out.println("The total purchase price is INR "+ totalPrice+ " if the quantity "+ quantity+ " and unit price is INR "+ unitPrice);
           // Close the input
        input.close();
    }
}