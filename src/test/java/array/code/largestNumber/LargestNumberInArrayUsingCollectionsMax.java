package array.code.largestNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArrayUsingCollectionsMax {

	public static void main(String[] args) {
		int[] arr = {234, 10, 324, 45,22222, 90, 9808};
		List<Integer> l = new ArrayList<>();
		for(int ar:arr) {	
			l.add(ar);
		}
		int max = Collections.max(l);
		System.out.println(max);

	}

	public static class LargestNumberInArrayUsingForLoop {
		public static void main(String[] args) {

			int arr[] = {10, 234, 10, 324,900099, 45, 22222, 90, 9808};
			int max = 0;

			for (int i = 1, j = i - 1; i < arr.length; i++) {
				if (arr[i] < arr[j]) {
					arr[i] = arr[j];
					max = arr[i];
				}
			}
			System.out.println(max);
		}
	}
}
