package interview.shiftZerosToRightAndLeft;

import java.util.Arrays;

public class ShiftZerosToLeft {

    private static void siftZeroToLeft(int[] num) {
        int nonZeroIndex = num.length-1;

        for(int i=num.length-1; i>=0; i--){
            if(num[i] != 0){
                num[nonZeroIndex--]=num[i];
            }
        }
        while(nonZeroIndex>=0){
            num[nonZeroIndex--] = 0;
        }
    }

    public static void main(String[] args) {
        int[] num = {0, 1, 4, 0, 3, 0, 0, 3, 4};
        System.out.println("Original of size("+num.length+") : "+ Arrays.toString(num));
        siftZeroToLeft(num);
        System.out.println("After Shift : "+Arrays.toString(num));
    }
}
