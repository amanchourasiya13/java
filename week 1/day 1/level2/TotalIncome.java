import java.util.Scanner;
public class TotalIncome{

    public static void main(String[] args) {
        // Create a input object for user input
        Scanner input  = new Scanner(System.in);

        // user to input  salary and bonus
        System.out.print("Enter salary: ");
        int salary = input.nextInt();

        System.out.print("Enter bonus: ");
        int bonus = input.nextInt();

        // Calculate the total salary 
        int  totalIncome= salary+bonus;
       
        // display the results
        System.out.println("The salary is INR "+ salary+" and bonus is INR "+ bonus+". Hence Total Income is INR "+totalIncome);

        // Close the input
        input.close();
    }
}
