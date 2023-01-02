package MainLessons.lesson02.methods.findOccurance;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Arrays;

public class findOccurance {

    public static List<findOccur> Occurance(List<String> words) {
        HashMap<String, Integer> wordCounts = new HashMap<>();
        for (String word : words) {
            if (!wordCounts.containsKey(word)) {
                wordCounts.put(word, 1);
            }
            else {
                wordCounts.put(word, wordCounts.get(word) + 1);
            }
        }
        List<findOccur> findOccurList = new ArrayList<>();
        for (String word : wordCounts.keySet()) {
            findOccur wc = new findOccur(word, wordCounts.get(word));
            findOccurList.add(wc);
        }
        return findOccurList;
    }

}

class findOccur {
    public String name;
    public int occurrence;

    public findOccur(String name, int occurrence) {
        this.name = name;
        this.occurrence = occurrence;
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("bird", "cat", "fox", "bird");
        List<findOccur> wordCounts = findOccur.main(words);

        for (findOccur wc : wordCounts) {
            System.out.println(wc.name + ": " + wc.occurrence);
        }
    }
}
