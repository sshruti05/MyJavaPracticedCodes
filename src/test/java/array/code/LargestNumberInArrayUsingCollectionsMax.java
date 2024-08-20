package array.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LargestNumberInArrayUsingCollectionsMax {

	public static void main(String[] args) {
		int arr[] = {234, 10, 324, 45,22222, 90, 9808};
		List<Integer> l = new ArrayList<>();
		for(int ar:arr) {	
			l.add(ar);
		}
		int max = Collections.max(l);
		System.out.println(max);

	}

}
