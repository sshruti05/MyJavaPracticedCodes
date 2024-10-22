package stream.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortValue {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>();
		m.put("Seema", 50);
		m.put("Priyanka", 32);
		m.put("Sneha", 31);
		
		Collections.sort(new ArrayList(m.values()),(e1,e2)->e1.values().compareTo(e2.values));
//		System.out.println(m.values().stream().(Collectors.toCollection(ArrayList::new)));
		

	}

}
