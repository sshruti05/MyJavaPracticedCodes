package array.code;

import java.util.Arrays;

public class LargestNumberInArrayUsingForLoop {
	public static void main(String[] args) {
		
		int arr[] = {10, 234, 10, 324, 45,22222, 90, 9808};
		int[] sortedArr = new int[arr.length];
		
		for(int i=1,j=i-1; i<arr.length;i++) {
				if(arr[i]<arr[j]) {
					arr[i]=arr[j];
					sortedArr[i]=arr[i];
			}
				
		}System.out.println(Arrays.toString(arr)+"--------------------");
			System.out.println(Arrays.toString(sortedArr));
//			for(int a:sortedArr)
//				System.out.print(a+" ");
		
		
	}
}
