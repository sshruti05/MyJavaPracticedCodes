package interview.shiftZerosToRightAndLeft;

import java.util.Arrays;

public class ShiftZerosToRight {
    private static void siftZeroToRight(int[] num) {
        int nonZeroIndex = 0;
        for(int i=0; i<num.length; i++){
            if(num[i] != 0){
                num[nonZeroIndex++] = num[i];
            }
        }
        while(nonZeroIndex< num.length){
            num[nonZeroIndex++] = 0;
        }
    }
    public static void main(String[] args) {
        int[] num = {0, 1, 4, 0, 3, 0, 0, 3, 4};
        System.out.println("Original of size("+num.length+") : "+ Arrays.toString(num));
        siftZeroToRight(num);
        System.out.println("After Shift : "+Arrays.toString(num));
    }
}
