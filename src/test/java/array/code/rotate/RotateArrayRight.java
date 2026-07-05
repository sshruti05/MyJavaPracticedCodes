package array.code.rotate;

import java.util.Arrays;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7}; // O/p: {5,6,7,1,2,3,4}
        int k = 3; // kth position to rotate
        int left = 0;
        int right = a.length-1;
//        First rotate the array using two pointer
        reversee(a, left, right);
        System.out.println(Arrays.toString(a));
//        Second rotate the array till first kth position
        reversee(a, 0, k-1);
        System.out.println(Arrays.toString(a));
//
        a = reversee(a, k, right);
        System.out.println(Arrays.toString(a));
    }
    public static int[] reversee(int[] a, int left, int right){
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
