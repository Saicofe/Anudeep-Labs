package lab1;
import java.util.*;
public class Amstrong {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the start of the range: ");
int start = scanner.nextInt();
System.out.print("Enter the end of the range: ");
int end = scanner.nextInt();
printArmstrongNumbers(start, end);
}
public static void printArmstrongNumbers(int start, int end) {
for (int i = start; i <= end; i++) {
if (isArmstrongNumber(i)) {
System.out.println(i);
}
}
}
public static boolean isArmstrongNumber(int num) {
int originalNum, remainder, result = 0;
originalNum = num;
while (originalNum != 0) {
remainder = originalNum % 10;
result += remainder * remainder * remainder;
originalNum /= 10;
}
return num == result;
}
}
