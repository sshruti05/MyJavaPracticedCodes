package array.code;

import java.util.Iterator;

public class FindDuplicateElementInAnArrat {

	public static void main(String[] args) {
		int[] a = {12, 4, 34, 12, 4, 9, 34, 8, 8, 90, 9};
		for (int i = 0; i < a.length; i++) {
			for(int j=i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("duplicate element found "+a[i]);
				}
			}
		}
	}

}
