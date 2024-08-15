package string.withoutinbuiltfunction;

import java.util.Scanner;

public class ReverseString1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String inputString = sc.nextLine();
		
		System.out.println("Original String: "+inputString);
		System.out.println("Reversed String: "+reverseString(inputString));
	}
	
	private static String reverseString(String s) {
		char[] ar = s.toCharArray();	
		char temp;
		for (int i=0, j=ar.length-1; i<(ar.length)/2; i++, j--) {
			temp = ar[i];
			ar[i] = ar[j];
			ar[j] = temp;
		}
		return new String(ar);	
	}
}
