package array.code;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int a[] = {234, 10, 324, 45,22222, 90, 9808};
		
		int max = a[0];
		for(int i=1; i<a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max);

	}

}
