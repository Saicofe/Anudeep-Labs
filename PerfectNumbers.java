package lab1;
    public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("Perfect numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (checkPerfectNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Function to check if a number is a perfect number
    public static boolean checkPerfectNumber(int num) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == num;
    }
}


