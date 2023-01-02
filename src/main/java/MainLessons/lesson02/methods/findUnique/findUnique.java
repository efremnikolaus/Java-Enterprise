package MainLessons.lesson02.methods.findUnique;

import java.util.ArrayList;
import java.util.List;

public class findUnique {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 1, 2, 3);
        List<Integer> uniqueList = findUnique(list);
        System.out.println(uniqueList);  // Outputs: [4, 5, 6]
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
