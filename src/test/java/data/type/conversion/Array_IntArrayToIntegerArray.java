package data.type.conversion;

public class Array_IntArrayToIntegerArray {

	public static void main(String[] args) {
		int[] a = new int[] {2, 4, 34, 23, 5};
		
		Integer[] in = new Integer[a.length];
		for(int i = 0; i < a.length; i++) {
			in[i] = a[i];
		}
		for(Integer i : in)
			System.out.print(i+" ");
	}
}
