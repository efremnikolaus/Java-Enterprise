package MainLessons.lesson02.methods.toList;

import java.util.Arrays;
import java.util.List;

public class toList {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println(list);  // Outputs: [1, 2, 3]
    }

    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }
}