package interview.array;

import java.util.Arrays;

public class SortArrayUsingSingleForLoop {
	public static void main(String[] args) {
		int[] arr = {13, 21, 4, 76, 4, 3, 32, 13, 34};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i]>arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				i = -1;	
				System.out.println(Arrays.toString(arr));
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
