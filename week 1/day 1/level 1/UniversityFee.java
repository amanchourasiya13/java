import java.util.Scanner;
public class UniversityFee{
public static void main(String []args){

   // Create a Scanner object for user input
    Scanner input=new Scanner(System.in);

   //taking input fee from user.
     System.out.print("Enter fee: ");
     int fee=input.nextInt();

   //taking discount oercentfrom user.
     System.out.print("Enter discount percent: ");
     int discountPercent = input.nextInt();

     int discount = fee*discountPercent/100;     // 125000*10/100=12500
     int finalFee= fee-discount;

   // display the result.
    System.out.println("The discount amount is INR "+discount+ " and final discounted fee is INR "+finalFee);

   //close the input
    input.close();
    }
}