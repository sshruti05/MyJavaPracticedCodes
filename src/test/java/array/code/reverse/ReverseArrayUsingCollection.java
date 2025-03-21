package array.code.reverse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseArrayUsingCollection {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, 5, 2, 1, 6, 3, 9, 4);
        Collections.reverse(list);
        System.out.println(list);
    }
}
