package lab1;

import java.util.LinkedList;
import java.util.Queue;

public class HotPotatoGame {
    public static void main(String[] args) {
        // Create a queue to represent the circle of players
        Queue<String> playerQueue = new LinkedList<>();

        // Enqueue player names
        playerQueue.offer("Player1");
        playerQueue.offer("Player2");
        playerQueue.offer("Player3");
        playerQueue.offer("Player4");
        playerQueue.offer("Player5");

        // Simulate the "Hot Potato" game
        simulateHotPotatoGame(playerQueue);
    }

    private static void simulateHotPotatoGame(Queue<String> playerQueue) {
        while (playerQueue.size() > 1) {
            // Dequeue the player at the front of the queue
            String currentPlayer = playerQueue.poll();

            // Display the player holding the "potato"
            System.out.println("Player holding the potato: " + currentPlayer);

            // Enqueue the player again to simulate passing the potato
            playerQueue.offer(currentPlayer);

            // Simulate a delay (e.g., by using Thread.sleep) to represent music playing
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Display a message indicating that the music has stopped
            System.out.println("Music stopped!");

            // Simulate the player being eliminated by not enqueuing them again
            playerQueue.poll();

            // Display the remaining players in the circle
            System.out.println("Remaining players: " + playerQueue);
            System.out.println("-----------------------------");
        }

        // Display the winner
        System.out.println("The winner is: " + playerQueue.poll());
    }
}

