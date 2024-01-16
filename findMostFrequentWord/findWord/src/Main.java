import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the text:");
        String text = scanner.nextLine();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Use HashMap to count the occurrences of each word
        Map<String, Integer> wordCounts = new HashMap<>();

        // Loop through the words and add them to the HashMap
        for (String word : words) {
            // Convert the word to lowercase for case-insensitive comparison
            String lowercaseWord = word.toLowerCase();

            // Check if the word is already in the HashMap
            if (wordCounts.containsKey(lowercaseWord)) {
                // If the word is already present, increment its count
                wordCounts.put(lowercaseWord, wordCounts.get(lowercaseWord) + 1);
            } else {
                // If the word is not present, add it to the HashMap with a count of 1
                wordCounts.put(lowercaseWord, 1);
            }
        }
        // Find the most frequent word
        String mostFrequentWord = "";
        int mostFrequentWordCount = 0;
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            if (entry.getValue() > mostFrequentWordCount) {
                mostFrequentWord = entry.getKey();
                mostFrequentWordCount = entry.getValue();
            }
        }

       // Display the result
        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("This word occurs " + mostFrequentWordCount + " times in the text.");

        scanner.close();
    }
}
