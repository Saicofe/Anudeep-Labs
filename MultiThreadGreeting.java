package lab1;
class GreetingThread extends Thread {
    private String[] names;

    public GreetingThread(String[] names) {
        this.names = names;
    }

    @Override
    public void run() {
        displayGreetings();
    }

    private void displayGreetings() {
        for (String name : names) {
            System.out.println("Welcome, " + name + "!");
            try {
                Thread.sleep(1000); // Simulating some work or delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultiThreadGreeting {
    public static void main(String[] args) {
        String[] userNames = {"sai", "kumar", "mahesh", "Daniel", "Eswar"};

        // Create two threads with the same array of names
        GreetingThread thread1 = new GreetingThread(userNames);
        GreetingThread thread2 = new GreetingThread(userNames);

        // Start the threads
        thread1.start();
        thread2.start();
    }
}
