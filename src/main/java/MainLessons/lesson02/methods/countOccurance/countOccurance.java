package MainLessons.lesson02.methods.countOccurance;

import java.util.List;
import java.util.Arrays;

public class countOccurance {
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

