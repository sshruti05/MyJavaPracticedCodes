package array.code.duplicate;

import java.util.Arrays;

public class RemoveDuplicatesFromArrayUsingStreams {
    public static void main(String[] args) {
        int[] a = {10, 30, 20, 10, 30, 10, 50, 30, 60, 100}; // O/P: [10, 30, 20, 50, 60, 100]

        a = Arrays.stream(a).distinct().toArray();
        System.out.println(Arrays.toString(a));
    }
}
