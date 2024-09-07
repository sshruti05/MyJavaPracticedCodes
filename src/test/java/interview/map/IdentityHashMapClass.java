package interview.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapClass {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap();
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		hm.put(i1, "Sneha");
		hm.put(i2,"Shruti");
		System.out.println(hm); // {10=Shruti}
		
		IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
		ihm.put(i1, "Sneha");
		ihm.put(i2, "Shruti");
		System.out.println(ihm); // {10=Sneha, 10=Shruti}	
	}
}
