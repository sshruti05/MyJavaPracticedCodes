package array.code.largestNumber;

import java.util.Arrays;

public class LargestNumberInArrayUsingArraysSortMethod {

	public static void main(String[] args) {
		int a[] = {234, 10, 324, 45,22222, 90, 9808};
		Arrays.sort(a);
		System.out.println(a[a.length-1]);

	}

}
