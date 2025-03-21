package array.code.largestNumber;

import java.util.Arrays;

public class MaximumDifferenceBetweenTwoElements {
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]-arr[0]);
	}
}
