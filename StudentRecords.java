package lab1;
import java.util.Scanner;

public class StudentRecords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudents = 3;

        int[] rollNumbers = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];
        double[] averageMarks = new double[numberOfStudents];

        // Read student records
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            rollNumbers[i] = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Name: ");
            names[i] = scanner.nextLine();
            System.out.print("Average Marks: ");
            averageMarks[i] = scanner.nextDouble();
        }

        // Display all student records
        System.out.println("Student Records:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Roll Number: " + rollNumbers[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Average Marks: " + averageMarks[i]);
            System.out.println();
        }

        // Display students who scored above 60
        System.out.println("Students who scored above 60:");
        for (int i = 0; i < numberOfStudents; i++) {
            if (averageMarks[i] > 60) {
                System.out.println("Roll Number: " + rollNumbers[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Average Marks: " + averageMarks[i]);
                System.out.println();
            }
        }
    }
}
