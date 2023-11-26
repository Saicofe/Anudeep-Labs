package lab1;
import java.util.HashMap;
import java.util.Map;

public class CricketScores {
    public static void main(String[] args) {
        // Create a Map to store cricketer names and their scores
        Map<String, Integer> cricketScoresMap = new HashMap<>();

        // Add cricketer names and scores to the map
        cricketScoresMap.put("Virat Kohli", 120);
        cricketScoresMap.put("Rohit Sharma", 80);
        cricketScoresMap.put("Steve Smith", 110);
        cricketScoresMap.put("Kane Williamson", 90);
        cricketScoresMap.put("Joe Root", 100);

        // Search for a batsman name and display the score
        searchAndDisplayScore("Virat Kohli", cricketScoresMap);
        searchAndDisplayScore("AB de Villiers", cricketScoresMap); // Not present in the map
    }

    private static void searchAndDisplayScore(String batsmanName, Map<String, Integer> scoresMap) {
        // Check if the batsman name is present in the map
        if (scoresMap.containsKey(batsmanName)) {
            // Display the score for the batsman
            System.out.println(batsmanName + "'s score: " + scoresMap.get(batsmanName));
        } else {
            // Display a message if the batsman name is not found
            System.out.println(batsmanName + " not found in the scores map.");
        }
    }
}
