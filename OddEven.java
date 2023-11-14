package lab1;
import java.util.Scanner;

public class OddEven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            System.out.print("Enter a number (or type '0' to exit): ");
            int number = scanner.nextInt();

            if (number == 0) {
                break; // Exit the loop if the user enters 0
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Total even numbers: " + evenCount);
        System.out.println("Total odd numbers: " + oddCount);
    }
}
