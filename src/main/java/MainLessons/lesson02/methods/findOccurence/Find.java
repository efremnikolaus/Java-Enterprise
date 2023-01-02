package MainLessons.lesson02.methods.findOccurence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Find {
    static class WordOccurrence {
        String name;
        int occurrence;
        public WordOccurrence(String name, int occurrence) {
            this.name = name;
            this.occurrence = occurrence;
        }
    }
    public static ArrayList<WordOccurrence> findOccurrence(ArrayList<String> words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }
        ArrayList<WordOccurrence> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            result.add(new WordOccurrence(entry.getKey(), entry.getValue()));
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("bird");
        words.add("cat");
        words.add("bird");
        words.add("fox");
        words.add("bird");
        words.add("fox");
        words.add("fox");
        ArrayList<WordOccurrence> occurrences = findOccurrence(words);
        for (WordOccurrence occurrence : occurrences) {
            System.out.println(occurrence.name + ": " + occurrence.occurrence);
        }
    }
}
