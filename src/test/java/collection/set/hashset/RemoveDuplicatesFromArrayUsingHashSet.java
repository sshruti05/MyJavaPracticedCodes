package collection.set.hashset;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArrayUsingHashSet {
	public static void main(String[] args) {
		int[] ar = {1,2,-5,2,-1,6,8,6,8,9,7,3};
		
		Set<Integer> s = new HashSet<>();
		for(int arr:ar )   
			s.add(arr);
	
		Integer[] num = s.toArray(new Integer[s.size()]);
		
		for (Integer i:num)
			System.out.print(i+" ");
		
		System.out.println("\n"+Arrays.toString(num));
		
	}
}
