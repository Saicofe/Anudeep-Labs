package lab1;
import java.util.*;
public class Internetsubscriber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the total data consumed in GB: ");
double totalDataConsumed = scanner.nextDouble();
double billAmount;
if (totalDataConsumed < 10) {
billAmount = 300.0; 
} else if (totalDataConsumed >= 10 && totalDataConsumed <= 30) {
billAmount = 300.0 + 5.0 * (totalDataConsumed - 10);
} else {
billAmount = 400.0 + 3.0 * (totalDataConsumed - 30);
}
System.out.println("Monthly Bill Amount: Rs. " + billAmount);
scanner.close();
}
}