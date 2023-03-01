package MainLessons.lesson05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
    public class BookStatistics {

        public static void main(String[] args) throws IOException {
            System.out.print("Enter book name: ");
            String bookName = System.console().readLine();

            Path bookPath = Paths.get("src", bookName);
            if (!Files.exists(bookPath)) {
                System.out.println("Book not found.");
                return;
            }
            Map<String, Long> wordCounts = Files.lines(bookPath)
                    .flatMap(line -> Arrays.stream(line.toLowerCase().split("\\W+")))
                    .filter(word -> word.length() > 2)
                    .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

            Comparator<Map.Entry<String, Long>> byCount = Map.Entry.comparingByValue(Comparator.reverseOrder());
            String top10Words = wordCounts.entrySet().stream()
                    .sorted(byCount)
                    .limit(10)
                    .map(entry -> entry.getKey() + " (" + entry.getValue() + ")")
                    .collect(Collectors.joining(", "));

            long numUniqueWords = wordCounts.keySet().size();

            Path statsPath = Paths.get("src", bookName + "_statistic.txt");
            try (var writer = Files.newBufferedWriter(statsPath)) {
                wordCounts.entrySet().stream()
                        .sorted(byCount)
                        .forEach(entry -> {
                            try {
                                writer.write(entry.getKey() + " -> " + entry.getValue() + "\n");
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
                writer.write("Total unique words: " + numUniqueWords);
            }

            System.out.println("Top 10 words: " + top10Words);
            System.out.println("Total unique words: " + numUniqueWords);
        }
    }