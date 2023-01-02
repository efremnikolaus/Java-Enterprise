package MainLessons.lesson02;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static int countOccurance(List<String> list, String s) {
        int count = 0;
        for (String str : list) {
            if (str.equals(s)) {
                count++;
            }
        }
        return count;
    }
    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }
    public static List<Integer> findUnique(List<Integer> list) {
        List<Integer> uniqueList = new ArrayList<>();
        for (int num : list) {
            if (!uniqueList.contains(num)) {
                uniqueList.add(num);
            }
        }
        return uniqueList;
    }
    public static Map<String, Integer> calcOccurance(List<String> list) {
        Map<String, Integer> occuranceMap = new HashMap<>();
        for (String s : list) {
            if (occuranceMap.containsKey(s)) {
                occuranceMap.put(s, occuranceMap.get(s) + 1);
            } else {
                occuranceMap.put(s, 1);
            }
        }
        return occuranceMap;
    }
}
