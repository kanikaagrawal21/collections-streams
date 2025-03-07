import java.io.*;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) throws IOException {
        String text = "Hello world, hello Java!"; // Example input
        Map<String, Integer> wordCount = countWords(text);
        System.out.println(wordCount); // Output: {hello=2, world=1, java=1}
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordMap = new HashMap<>();

        // Normalize text: Convert to lowercase and remove punctuation
        text = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        // Split words and count frequency
        for (String word : text.split("\\s+")) {
            if (!word.isEmpty()) {
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        return wordMap;
    }
}
