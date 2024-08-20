package array.code;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 3, 7,-8, -3};
		Arrays.sort(arr);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		int[] a = {-3, 1, 3,-8, 7};
		Arrays.sort(a);
		System.out.println(a);
		System.out.println(Arrays.toString(a));
		
		int[] b = new int[] {1, 3, 7,-8, -3};
		System.out.println("Array before sorting: ");
		for(int i : b)
			System.out.print(i+" ");
		
		Arrays.sort(b);
		
		System.out.println("\nArray after sorting: ");
		for(int i: b)
			System.out.print(i+" ");
		
	}

}
