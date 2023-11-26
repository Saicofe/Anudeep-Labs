package lab1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class DictionaryApplication {
    public static void main(String[] args) {
        // Create a TreeMap to store word-definition pairs
        TreeMap<String, String> dictionary = new TreeMap<>();

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Add word-definition pairs to the dictionary
        addWordToDictionary("apple", "a fruit", dictionary);
        addWordToDictionary("book", "a set of written or printed pages", dictionary);
        addWordToDictionary("computer", "an electronic device for storing and processing data", dictionary);

        // Display all word-definition pairs in alphabetical order
        displayDictionary(dictionary);

        // Retrieve and display the definition of a specific word
        retrieveAndDisplayDefinition("book", dictionary);

        // Allow the user to input additional word-definition pairs
        inputAdditionalWords(scanner, dictionary);

        // Display the updated dictionary
        displayDictionary(dictionary);

        // Close the scanner
        scanner.close();
    }

    // Method to add a word-definition pair to the dictionary
    private static void addWordToDictionary(String word, String definition, TreeMap<String, String> dictionary) {
        dictionary.put(word, definition);
    }

    // Method to retrieve and display the definition of a specific word
    private static void retrieveAndDisplayDefinition(String word, TreeMap<String, String> dictionary) {
        if (dictionary.containsKey(word)) {
            System.out.println("Definition of '" + word + "': " + dictionary.get(word));
        } else {
            System.out.println("Word '" + word + "' not found in the dictionary.");
        }
    }

    // Method to display all word-definition pairs in alphabetical order
    private static void displayDictionary(TreeMap<String, String> dictionary) {
        System.out.println("Dictionary (in alphabetical order):");
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("-----------------------------");
    }

    // Method to allow the user to input additional word-definition pairs
    private static void inputAdditionalWords(Scanner scanner, TreeMap<String, String> dictionary) {
        System.out.println("Enter additional word-definition pairs (type 'exit' to finish):");
        String inputWord;
        do {
            System.out.print("Word: ");
            inputWord = scanner.nextLine().trim().toLowerCase();
            if (!inputWord.equals("exit")) {
                System.out.print("Definition: ");
                String definition = scanner.nextLine().trim();
                addWordToDictionary(inputWord, definition, dictionary);
            }
        } while (!inputWord.equals("exit"));
    }
}
