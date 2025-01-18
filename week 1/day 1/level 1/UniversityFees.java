/* The University is charging the student a fee of INR 125000 for the course. The University is willing to offer a discount of 10%. Write a program to find the discounted amount and discounted price the student will pay for the course.
 */
public class UniversityFees{
public static void main(String []args){

    // create variables and assign the values 
       int fee=125000;
       int discountPercent= 10;
       int discountAmount= fee*discountPercent/100;     // 125000*10/100=12500
       int finalFee= fee-discountAmount;  

   //display the result
       System.out.println("The discount amount is INR "+discountAmount+ " and final discounted fee is INR "+finalFee);
    }
}