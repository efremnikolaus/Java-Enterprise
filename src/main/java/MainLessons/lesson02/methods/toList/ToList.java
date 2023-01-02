package MainLessons.lesson02.methods.toList;

import java.util.Arrays;
import java.util.List;

public class ToList {
    public static void main(String[] args) {
        Integer[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println(list);
    }
    public static <T> List<T> toList(T[] array) {
        return Arrays.asList(array);
    }
}
