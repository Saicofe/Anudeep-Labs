package lab1;
public class Pattern {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the pattern

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print("#");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
