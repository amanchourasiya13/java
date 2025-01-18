import java.util.Scanner;

public class MarksGradeCalculator2DArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create a 2D array to store marks for each student (rows = students, columns = subjects)
        double[][] marks = new double[numberOfStudents][3]; // 3 subjects: Physics, Chemistry, Maths
        double[] percentages = new double[numberOfStudents];
        String[] grades = new String[numberOfStudents];
        String[] remarks = new String[numberOfStudents];

        // Take input for marks and calculate percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nEnter details for Student " + (i + 1));

            // Input marks for Physics
            do {
                System.out.print("Enter marks for Physics (0-100): ");
                marks[i][0] = input.nextDouble();
                if (marks[i][0] < 0 || marks[i][0] > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (marks[i][0] < 0 || marks[i][0] > 100);

            // Input marks for Chemistry
            do {
                System.out.print("Enter marks for Chemistry (0-100): ");
                marks[i][1] = input.nextDouble();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (marks[i][1] < 0 || marks[i][1] > 100);

            // Input marks for Maths
            do {
                System.out.print("Enter marks for Maths (0-100): ");
                marks[i][2] = input.nextDouble();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Marks should be between 0 and 100. Please enter valid marks.");
                }
            } while (marks[i][2] < 0 || marks[i][2] > 100);

            // Calculate total and percentage
            double totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 300) * 100;

            // Determine grade and remarks based on percentage
            if (percentages[i] >= 80) {
                grades[i] = "A";
                remarks[i] = "Level 4: Above agency-normalized standard";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
                remarks[i] = "Level 3: At agency-normalized standard";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
                remarks[i] = "Level 2: Below but appropriate agency-normalized standard";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
                remarks[i] = "Level 1: Well below agency-normalized standard";
            } else if (percentages[i] >= 40) {
                grades[i] = "E";
                remarks[i] = "Level 1: Too below agency-normalized standard";
            } else {
                grades[i] = "R";
                remarks[i] = "Remedial standard";
            }
        }

        // Display the marks, percentages, and grades of each student
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics Marks: " + marks[i][0]);
            System.out.println("Chemistry Marks: " + marks[i][1]);
            System.out.println("Maths Marks: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentages[i]);
            System.out.println("Grade: " + grades[i]);
            System.out.println("Remarks: " + remarks[i]);
        }

        // Close the input
        input.close();
    }
}
