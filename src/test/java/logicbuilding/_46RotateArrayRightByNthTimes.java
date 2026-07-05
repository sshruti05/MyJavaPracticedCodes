package logicbuilding;

import java.util.Arrays;

public class _46RotateArrayRightByNthTimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int kthPosition = 3;

        System.out.println("Input: "+Arrays.toString(arr));

        rorateRight(arr, kthPosition);

        System.out.println("Output: "+Arrays.toString(arr));
    }

    private static void rorateRight(int[] arr, int k) {
        int left = 0;
        int right = arr.length-1;
        reverse(arr, left, right);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);
    }

    private static int[] reverse(int[] arr, int leftpointer, int rightPointer) {
        int temp;
        while(leftpointer<rightPointer){
            temp = arr[leftpointer];
            arr[leftpointer] = arr[rightPointer];
            arr[rightPointer] = temp;
            leftpointer++;
            rightPointer--;
        }
        return arr;
    }
}
