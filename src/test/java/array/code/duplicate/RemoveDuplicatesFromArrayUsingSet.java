package array.code.duplicate;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayUsingSet {
    public static void main(String[] args) {
        int[] a = {10, 30, 20, 10, 30, 10, 50, 30, 100}; // O/P: [10, 30, 20, 50, 100]
        Set<Integer> set = new LinkedHashSet<>();

        for(int i : a){
            set.add(i);
        }
//        System.out.println(set);
//        Convert Set<integer> to int[] array.
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}
