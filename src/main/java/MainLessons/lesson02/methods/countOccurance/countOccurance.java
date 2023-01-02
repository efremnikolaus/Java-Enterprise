package MainLessons.lesson02.methods.countOccurance;

import java.util.List;

public class countOccurance {
    public static void main(String[] args) {
        List<String> list = List.of("hello", "world", "hello", "there", "world", "hi");
        System.out.println(countOccurance(list, "hello"));  // Outputs: 2
        System.out.println(countOccurance(list, "world"));  // Outputs: 2
        System.out.println(countOccurance(list, "there"));  // Outputs: 1
        System.out.println(countOccurance(list, "hi"));  // Outputs: 1
    }

    public static int countOccurance(List<String> list, String s) {
        int count = 0;
        for (String str : list) {
            if (str.equals(s)) {
                count++;
            }
        }
        return count;
    }
}

