import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First No:  ");
         int a=sc.nextInt();
        System.out.print("Enter Second No: ");
         int b=sc.nextInt();
        System.out.print("Enter Third No: ");
         int c=sc.nextInt();
int Average= (a+b+c)/3;
System.out.print("Average of Three Numbers: "+ Average);
    }
}
