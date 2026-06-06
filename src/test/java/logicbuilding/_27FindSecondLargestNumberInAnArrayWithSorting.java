package logicbuilding;

import java.util.Arrays;

public class _27FindSecondLargestNumberInAnArrayWithSorting {
    public static void main(String[] args) {
        int[] input = {3, 1, 6, 8, 9, 3, 8};
        Arrays.sort(input);
        System.out.println("Second Largest no is: "+input[input.length-2]);
        System.out.println("Largest no is: "+input[input.length-1]);
    }
}
