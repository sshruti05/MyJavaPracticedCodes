package array.code;

import java.util.Arrays;
import java.util.stream.Stream;

public class MaximumDifferenceBetweenTwoElements {
	public static void main(String[] args) {
		
		int[] arr = {2, 3, 10, 6, 4, 8, 1};
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]-arr[0]);
		
//		int max_diff = arr[1]- arr[0];
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=i+1; j<arr.length; j++) {
//				if(arr[j])
//			}
//		}
	}

}
