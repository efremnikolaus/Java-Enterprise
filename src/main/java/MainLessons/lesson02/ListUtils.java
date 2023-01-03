package MainLessons.lesson02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListUtils {
    public static class CalcOccurence {
        public static void calcOccurence(List<String> words) {
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
            CalcOccurence.calcOccurence(words);
        }
    }
    public static class CountOccurence {
        public static int countOccurrences(List<String> list, String s) {
            int count = 0;
            for (String element : list) {
                if (element.equals(s)) {
                    count++;
                }
            }
            return count;
        }
        public static void main(String[] args) {
            List<String> list = Arrays.asList("Hello", "World", "Hello", "Java");
            String s = "Hello";
            int count = countOccurrences(list, s);
            System.out.println(count);
        }
    }
    public static class FindOccurence {
        static class WordOccurrence {
            String name;
            int occurrence;
            public WordOccurrence(String name, int occurrence) {
                this.name = name;
                this.occurrence = occurrence;
            }
        }
        public static ArrayList<FindOccurence.WordOccurrence> findOccurrence(ArrayList<String> words) {
            Map<String, Integer> wordCount = new HashMap<>();
            for (String word : words) {
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);
                } else {
                    wordCount.put(word, 1);
                }
            }
            ArrayList<FindOccurence.WordOccurrence> result = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                result.add(new FindOccurence.WordOccurrence(entry.getKey(), entry.getValue()));
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
            ArrayList<FindOccurence.WordOccurrence> occurrences = findOccurrence(words);
            for (FindOccurence.WordOccurrence occurrence : occurrences) {
                System.out.println(occurrence.name + ": " + occurrence.occurrence);
            }
        }
    }
    public static class FindUnique {
        public static void main(String[] args) {
            List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 1, 2, 3, 7, 2, 9);
            List<Integer> uniqueList = findUnique(list);
            System.out.println(uniqueList);
        }
        public static List<Integer> findUnique(List<Integer> list) {
            List<Integer> uniqueList = new ArrayList<>();
            for (Integer i : list) {
                if (!uniqueList.contains(i)) {
                    uniqueList.add(i);
                }
            }
            return uniqueList;
        }
    }
    public static class ToList {
        public static void main(String[] args) {
            Integer[] array = {1, 2, 3};
            List<Integer> list = toList(array);
            System.out.println(list);
        }
        public static <T> List<T> toList(T[] array) {
            return Arrays.asList(array);
        }
    }

}
