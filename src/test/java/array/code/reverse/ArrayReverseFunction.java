package array.code.reverse;

import java.util.Arrays;

public class ArrayReverseFunction {
	public static void main(String[] args) {
		int[] ae = {1,2,4,6,2,4,6,7,8};
//		Arrays.sort(ae); //sorted
//		System.out.println(Arrays.toString(ae)); //[1, 2, 2, 4, 4, 6, 6, 7, 8]
		int[] a = reverseArray(ae); //reversed
		printReversedArray(a);
		
	}
	private static int[] reverseArray(int[] arr) {
		int temp=0;
		for(int i=0; i<arr.length/2; i++){
			int left = i;
			int right = arr.length-1-i;
			temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
		}return arr;
	}
	private static void printReversedArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
