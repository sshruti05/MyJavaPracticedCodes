package array.code.largestNumber;
import java.util.*;
public class LargestNumberInArray {

	public static void main(String[] args) {
		int a[] = {234, 10, 324, 45,22222, 90, 9808};
//		Method1:
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);
//		Method2:
		Arrays.sort(a);
		System.out.println(a[a.length-1]);
	}

}
