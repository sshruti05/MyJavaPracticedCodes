package logicbuilding;

import java.util.Arrays;

public class _20ReverseArray {
    public static void main(String[] args) {
        int[] input = {10, 20, 30 ,40 ,50};
        int[] newArray = new int[input.length];
        int index = 0;
        for(int i=input.length-1; i>=0; i--){
            newArray[index] = input[i];
            index++;
        }
        input = newArray;
        System.out.println(Arrays.toString(input));
    }
}
