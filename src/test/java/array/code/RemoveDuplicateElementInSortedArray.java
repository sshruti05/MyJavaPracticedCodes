package array.code;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElementInSortedArray {

	public static void main(String[] args) {
		System.out.println("Method1: Using temp array*************************");
		int[] num = {1,2,2,3,4,5,5,5};
		
		int[] temp = new int[num.length];
		int j=0;
		for(int i=0; i<num.length-1; i++) {
			if(num[i] != num[i+1]) {
				temp[j]=num[i];
				j++;
			}
		}temp[j] = num[num.length-1];
		System.out.print(Arrays.toString(temp)); //[1, 2, 3, 4, 5, 0, 0, 0]
//=============================================================================		
		System.out.println("\nMethod2: using same array*************************");
		int[] num1 = {1,2,2,3,4,4,6,6,6,8};
		int k=0;
		for(int i=0; i<num1.length-1; i++) {
			if(num1[i] != num1[i+1]) {
				num1[k]=num1[i];
				k++;
			}
		}
		num1[k] = num1[num1.length-1];
		for(int m=0; m<=k; m++) {
			System.out.print(num1[m]+" ");
		}

//	============================================================
		System.out.println("\nMethod3: Using HashSet*************************");
		int[] nums = {1,2,2,2,3,4,4,6,6,7,8};
		
		Set<Integer> set = new HashSet<>();
		for(int num_:nums)
			set.add(num_);
		for(int unique_num:set)
			System.out.print(unique_num+" ");
		System.out.println(" ");
		set.stream().forEach(System.out::println);
		set.stream().forEach(s-> System.out.print(s+" "));
		
//		============================================================
		System.out.println("\nMethod4: Using Java8 Stream*************************");
		int[] nums1 = {1,3,4,4,6,6,6,2,2,7,8,8,8,9};

		Arrays.stream(nums1).sorted().distinct().forEach(s-> System.out.print(s+" "));
//		.forEach(System.out::print);
	}
}
