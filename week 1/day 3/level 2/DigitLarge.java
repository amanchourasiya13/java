import java.util.*;


public class DigitLarge{

 public static void main(String args[]){

     //create an input object
	Scanner input = new Scanner(System.in);
	
	// taking the input of user age
	 System.out.print("Enter the  number: ");
	 int number = input.nextInt();
	
	int index=0;
	int count=0;
	int tempnumber = number;
	    while (tempnumber > 0) {
            count++;
            tempnumber /= 10;
      }

	// create the singleDimension array.
	int digit [] = new int[count];

	// count the digit 
	
	for(int i=0; i<count; i++){
		digit[i] = number % 10;
		//digit[index] = single;
		number /=10;
	}

	/* for(int i=0; i<count; i++){
	  // print the all digit present in the array.	
	  System.out.println(digit[i] + " ");
	} */
	 
	 // sort(arr, arr+n);
	 Arrays.sort(digit);
	 
	 System.out.print("Smallest element " + digit[0] + " Largest element " + digit[count-1]);
	 
	input.close();
 }
}

