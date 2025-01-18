/* Create a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 191. 
*/
public class ProfitLoss{
public static void main(String []args){
       // create variables and assign values
          int CostPrice=129;
          int SellingPrice=191;
          int Profit=SellingPrice-CostPrice;
          double ProfitPercentage=(double)Profit/ (double)CostPrice*100;  // convert int to double data type 

       //display the result
          System.out.println("The Cost Price is INR "+ CostPrice +" and Selling Price is INR "+SellingPrice);
          System.out.println("The Profit is INR "+ Profit+" and the Profit Percentage is "+ProfitPercentage);
    }
}