package lab1;
import java.util.Scanner;
public class Employees {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int choice;
do {
System.out.print("Enter the basic salary: ");
double basicSalary = scanner.nextDouble();
double hra, da, grossSalary;
if (basicSalary > 15000) {
hra = 0.20 * basicSalary;
da = 0.60 * basicSalary;
} else {
hra = 3000;
da = 0.70 * basicSalary;
}
grossSalary = basicSalary + hra + da;
System.out.println("Gross Salary: " + grossSalary);
System.out.print("Enter -1 to exit, or any other number to continue: ");
choice = scanner.nextInt();
} while (choice != -1);
}
}