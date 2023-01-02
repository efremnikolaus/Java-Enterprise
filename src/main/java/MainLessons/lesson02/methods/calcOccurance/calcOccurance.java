package MainLessons.lesson02.methods.calcOccurance;

import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class calcOccurance {
    public static void calcOccurance(List<String> words) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (!wordCounts.containsKey(word)) {
                wordCounts.put(word, 1);
            }
            else {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
        }
        for (String word : wordCounts.keySet()) {
            System.out.println(word + ": " + wordCounts.get(word));
        }
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("bird", "cat", "fox", "bird");
        calcOccurance.calcOccurance(words);
    }
}