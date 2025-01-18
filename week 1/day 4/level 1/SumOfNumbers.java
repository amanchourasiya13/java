import java.util.Scanner;
public class  SumOfNumbers{

  double NaturalNum(double number){
  Scanner input  = new Scanner(System.in);
      double sum=0;
        // while loop to check number is 0
        while(number!=0 && number>0){
number=input.nextDouble();
                sum += number;
                     }
return sum;
}
    public static void main(String[] args) {

        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input number
        System.out.print("Enter number  : ");
       double  number = input.nextDouble();

  
    // create an obj object 
     SumOfNumbers obj=new SumOfNumbers();
      System.out.print("your sum is:"+ obj.NaturalNum(number));

        // Close the input
        input.close();
    }
}
