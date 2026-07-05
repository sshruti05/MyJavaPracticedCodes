package array.code.rotate;

import java.util.Arrays;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7}; // O/p: {4,5,6,7,1,2,3}
        int k=3; // Kth position shift to the left
        int left=0;
        int right = a.length-1;
        System.out.println("Input: "+Arrays.toString(a));
        reverse(a, 0, k-1);
        reverse(a, k, right);
        reverse(a, left, right);
        System.out.println("Output after "+k+"th postion left shift "+Arrays.toString(a));

    }
    private static int[] reverse(int[] a, int left, int right){
        int temp;
        while(left<right){
            temp = a[left];
            a[left] = a[right];
            a[right] = temp;
            left++;
            right--;
        }
        return a;
    }
}
