package string.withoutinbuiltfunction;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharactersInString {
	
	public static void main(String[] args) {
		
	
		String s = "snehash hhaaa sdsjd";		
		Map<Character, Integer> m = new HashMap<>();
		
		for ( Character c: s.toLowerCase().toCharArray()) {
			if(c != ' ') {							
				if(m.containsKey(c))
					m.put(c, m.get(c)+1);
				else
					m.put(c, 1);
			}			
		}
		boolean noDupe = true;
		for( Character c : m.keySet() ) {
			
			if(m.get(c)>1) {
				System.out.println(c+" "+m.get(c));
				noDupe = false;
			}
		}	
		if(noDupe) {
			
			System.out.println("No duplicates found");
			
		}
	}
}