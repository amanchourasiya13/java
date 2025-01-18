import java.util.Random;

public class MatrixOperations {

    // Method to create a random matrix with given rows and columns
    public static int[][] createRandomMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = rand.nextInt(10) + 1; // Random number between 1 and 10
            }
        }
        return matrix;
    }

    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication not possible. Column of matrix1 must equal row of matrix2.");
            return null;
        }

        int[][] result = new int[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to find the transpose of a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] result = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }

    // Method to find the determinant of a 2x2 matrix
    public static int determinant2x2(int[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    // Method to find the determinant of a 3x3 matrix
    public static int determinant3x3(int[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1])
                - matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0])
                + matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }

    // Method to find the inverse of a 2x2 matrix
    public static double[][] inverse2x2(int[][] matrix) {
        int det = determinant2x2(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        double[][] inverse = new double[2][2];
        inverse[0][0] = (double) matrix[1][1] / det;
        inverse[0][1] = (double) -matrix[0][1] / det;
        inverse[1][0] = (double) -matrix[1][0] / det;
        inverse[1][1] = (double) matrix[0][0] / det;

        return inverse;
    }

    // Method to find the inverse of a 3x3 matrix
    public static double[][] inverse3x3(int[][] matrix) {
        int det = determinant3x3(matrix);
        if (det == 0) {
            System.out.println("Matrix is singular, inverse does not exist.");
            return null;
        }

        double[][] adjugate = new double[3][3];
        adjugate[0][0] = determinant2x2(new int[][] {{matrix[1][1], matrix[1][2]}, {matrix[2][1], matrix[2][2]}});
        adjugate[0][1] = -determinant2x2(new int[][] {{matrix[1][0], matrix[1][2]}, {matrix[2][0], matrix[2][2]}});
        adjugate[0][2] = determinant2x2(new int[][] {{matrix[1][0], matrix[1][1]}, {matrix[2][0], matrix[2][1]}});
        
        adjugate[1][0] = -determinant2x2(new int[][] {{matrix[0][1], matrix[0][2]}, {matrix[2][1], matrix[2][2]}});
        adjugate[1][1] = determinant2x2(new int[][] {{matrix[0][0], matrix[0][2]}, {matrix[2][0], matrix[2][2]}});
        adjugate[1][2] = -determinant2x2(new int[][] {{matrix[0][0], matrix[0][1]}, {matrix[2][0], matrix[2][1]}});
        
        adjugate[2][0] = determinant2x2(new int[][] {{matrix[0][1], matrix[0][2]}, {matrix[1][1], matrix[1][2]}});
        adjugate[2][1] = -determinant2x2(new int[][] {{matrix[0][0], matrix[0][2]}, {matrix[1][0], matrix[1][2]}});
        adjugate[2][2] = determinant2x2(new int[][] {{matrix[0][0], matrix[0][1]}, {matrix[1][0], matrix[1][1]}});

        double[][] inverse = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = adjugate[i][j] / det;
            }
        }
        return inverse;
    }

    // Main program
    public static void main(String[] args) {
        // Create two random 3x3 matrices
        int rows = 3, cols = 3;
        int[][] matrix1 = createRandomMatrix(rows, cols);
        int[][] matrix2 = createRandomMatrix(rows, cols);

        System.out.println("Matrix 1:");
        displayMatrix(matrix1);

        System.out.println("Matrix 2:");
        displayMatrix(matrix2);

        // Perform addition
        int[][] resultAdd = addMatrices(matrix1, matrix2);
        System.out.println("Matrix 1 + Matrix 2:");
        displayMatrix(resultAdd);

        // Perform subtraction
        int[][] resultSub = subtractMatrices(matrix1, matrix2);
        System.out.println("Matrix 1 - Matrix 2:");
        displayMatrix(resultSub);

        // Perform multiplication
        int[][] resultMul = multiplyMatrices(matrix1, matrix2);
        System.out.println("Matrix 1 * Matrix 2:");
        displayMatrix(resultMul);

        // Perform transpose
        int[][] resultTranspose = transposeMatrix(matrix1);
        System.out.println("Transpose of Matrix 1:");
        displayMatrix(resultTranspose);

        // Find determinant of 3x3 matrix
        int detMatrix1 = determinant3x3(matrix1);
        System.out.println("Determinant of Matrix 1: " + detMatrix1);

        // Find inverse of 3x3 matrix
        double[][] invMatrix1 = inverse3x3(matrix1);
        if (invMatrix1 != null) {
            System.out.println("Inverse of Matrix 1:");
            for (int i = 0; i < invMatrix1.length; i++) {
                for (int j = 0; j < invMatrix1[i].length; j++) {
                    System.out.print(invMatrix1[i][j] + "\t");
                }
                System.out.println();
            }
        }
    }
}
