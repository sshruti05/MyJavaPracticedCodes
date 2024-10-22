package array.code;

import java.util.Arrays;

public class LargestNumberInArrayUsingJava8 {
	public static void main(String[] args) {
			
	int a[] = {234, 10, 324, 45,22222, 90, 9808};
	Arrays.stream(a).max().getAsInt();
	int max = Arrays.stream(a).max().getAsInt();
	int min = Arrays.stream(a).min().getAsInt();
	System.out.println(max);
	System.out.println(min);
	
	}
}
