package logicbuilding;

import java.util.Arrays;

public class _22MoveAllZerosAtEnd {
    public static void main(String[] args) {
        int[] input = {1, 0, 2, 0, 0, 3, 0};

        int nonZeroIndex = 0;
        int temp;

        for(int current=0; current<input.length; current++){
            if(input[current] != 0) {
                temp = input[nonZeroIndex];
                input[nonZeroIndex] = input[current];
                input[current] = temp;
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(input));
    }
}
