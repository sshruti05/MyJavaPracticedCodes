package array.code;

import java.util.Arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		int[] a = {2,3,5};
		int[] b = {3,6,7,3};
		int[] c = new int[ a.length + b.length ];
		for(int i=0; i<a.length; i++)
			c[i] = a[i];
		int clen = a.length;
		for(int j=0; j<b.length; j++) {
			c[clen+j] = b[j];
//			c[clen] = b[j];
//			clen++;
		}
		for(int c1:c)
			System.out.print(c1+" ");
		
		System.out.println("\n"+Arrays.toString(c));
	}

}
