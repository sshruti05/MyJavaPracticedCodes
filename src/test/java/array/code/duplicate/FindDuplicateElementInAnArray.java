package array.code.duplicate;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElementInAnArray {

	public static void main(String[] args) {
		int[] a = {12, 4, 34, 12, 4, 9, 34, 8, 8, 90, 9};
		System.out.println("*********METHOD 1************");
//		Method1:
		for (int i = 0; i < a.length; i++) {
			boolean isDupliacate = false;
			for(int j=i+1; j < a.length; j++) {
				if(a[i]==a[j]) {
					isDupliacate = true;
					break;
				}
			}
			if(isDupliacate){
				System.out.println(a[i]);
			}
			else{
				System.out.println("No duplicates found!!!");
			}
		}
		System.out.println("*********METHOD 2************");
//		Method2:
		Set<Integer> set = new HashSet<>();
		System.out.print("Duplicates in HashSet: ");
		for(int num: a){
			if(!set.add(num)){
				System.out.print(num +", ");
			}
		}
		System.out.println();

		System.out.println("*********METHOD 3************");
//		Method3:
		String str = "thfjgikoOQIT";
		char[] c = str.toLowerCase().toCharArray();
		for(int i=0; i< c.length; i++){
			boolean isDuplicate = false;
			for(int j=i+1; j<c.length; j++){
				if(c[i] == c[j]){
					isDuplicate = true;
					break;
				}
			}
			if(isDuplicate){
				System.out.println(c[i]);
			}
		}
		System.out.println("*********METHOD 3************");
//		Method4:
		String s = "thfjgikoOQIT";
		Set<Character> set1 =  new HashSet<>();
		System.out.println("1st method");
		for(char ch:s.toLowerCase().toCharArray()) {
			if (!set1.add(ch)) {
				System.out.print(ch + ",");
			}
		}
		System.out.println("2nd method");
		for(int i=0; i<s.length(); i++){
			if(!set1.add(s.toLowerCase().charAt(i))){
				System.out.print(s.charAt(i)+",");
			}
		}
	}
}
