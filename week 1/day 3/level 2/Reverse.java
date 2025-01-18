

import java.util.*;


public class Reverse{

 public static void main(String args[]){
         // creating input object 
    	Scanner input = new Scanner(System.in);
	
     // taking the input number
	 System.out.print("Enter the  number: "); 
	 int number = input.nextInt();
	
	int index=0;
	int count=0;
	int tempnumber = number;
	// count the digit
	    while (tempnumber > 0) {
            count++;
            tempnumber /= 10;
      }

	// create the singleDimension array.
	int digit [] = new int[count];

	// store element in reverse order  
	
	for(int i=0; i<count; i++){
		digit[i] = number % 10;
		//digit[index] = single;
		number /=10;
	}
System.out.print("the reverse number is : ");
	for(int i=0; i<count; i++){
	  // print the all digit present in the array.	
	  System.out.print( digit[i] + " ");
	}
	 
	//close the input
	input.close();
 }
}