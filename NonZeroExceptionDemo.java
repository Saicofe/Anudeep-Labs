package lab1;

// Custom exception class to check for non-zero value
class NonZeroException extends Exception {
    public NonZeroException(String message) {
        super(message);
    }
}
class SquareFinder {
    private double number;

    public SquareFinder(double number) throws NonZeroException {
        if (number == 0) {
            throw new NonZeroException("Number cannot be zero.");
        }
        this.number = number;
    }

    public double findSquare() {
        return number * number;
    }
}
    public class NonZeroExceptionDemo{
    public static void main(String[] args) {
        try {
            double inputNumber = 5; // Change this to the number you want to find the square of

            SquareFinder squareFinder = new SquareFinder(inputNumber);
            double result = squareFinder.findSquare();
            System.out.println("The square of " + inputNumber + " is: " + result);
        } catch (NonZeroException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
    }