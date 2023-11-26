package lab1;

public class AverageThread extends Thread {
    private int[] numbers;

    public AverageThread(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public void run() {
        synchronized (this) {
            calculateAverage();
        }
    }

    private void calculateAverage() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        double average = (double) sum / 10;
        System.out.println("Average of the first 10 numbers: " + average);
    }
}

class SquareThread extends Thread {
    private int[] arr;

    public SquareThread(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (this) {
            printSquares();
        }
    }

    private void printSquares() {
        System.out.print("Squares of numbers in the array: ");
        for (int num : arr) {
            int square = num * num;
            System.out.print(square + " ");
        }
        System.out.println();
    }
}

public class TwoThreadsExample {
    public static void main(String[] args) {
        int[] arr = {1, 20, 50, 15, 30};

        AverageThread averageThread = new AverageThread(null); 
        SquareThread squareThread = new SquareThread(arr);

        averageThread.start();
        try {
            averageThread.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        squareThread.start();
    }
}