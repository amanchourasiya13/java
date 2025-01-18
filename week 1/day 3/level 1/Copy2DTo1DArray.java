import java.util.Scanner;

public class Copy2DTo1DArray {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Take user input for the number of rows and columns
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Create a 2D array (matrix) based on user input for rows and columns
        int[][] matrix = new int[rows][cols];

        // Take user input
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Element at [" + i + "][" + j + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array to store the elements of the 2D array
        int[] array = new int[rows * cols];

        // Define an index variable for the 1D array
        int index = 0;

        // Loop through the 2D array and copy elements to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[index] = matrix[i][j];  // Copy element to 1D array
                index++;  // Increment index
            }
        }

        // Display the elements of the 1D array
        System.out.println("\nElements in the 1D array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        // Close the scanner
        input.close();
    }
}
