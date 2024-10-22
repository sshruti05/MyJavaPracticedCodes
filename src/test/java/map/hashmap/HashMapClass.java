package map.hashmap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
/*
 * put(Object key, Object value)
 * putAll(Map m)
 * 
 */

public class HashMapClass {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Sneh", 32);
		map.put("Shuru", 54);
		map.put("Pri", 34);
		System.out.println(map); 	// {Shuru=54, Pri=34, Sneh=32}
		map.put("Jais", 35);
		Set<String> keySet = map.keySet();
		Collection<Integer> values = map.values();
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(keySet);		// [Shuru, Jais, Pri, Sneh]
		System.out.println(values);		// [54, 35, 34, 32]
		System.out.println(entrySet);	//[Shuru=54, Jais=35, Pri=34, Sneh=32]
/*
   On entrySet we can apply K getKey(), V getValue() and V setValue() methods.
   We can also apply Comparator<Map.Entry<K, V>> comparingByKey(),
   Comparator<Map.Entry<K, V>> comparingByValue(),
   Comparator<Map.Entry<K, V>> comparingByKey(Comparator<? super K> cmp),
   Comparator<Map.Entry<K, V>> comparingByValue(Comparator<? super V> cmp)
 */
		Iterator it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry<String, Integer> m = (Map.Entry) it.next();
			System.out.println(m.getKey()+" "+m.getValue());
			if(m.getKey() == "Shuru") {
				m.setValue(31);
			}
		}
		System.out.println(map);	//{Jais=35, Pri=34, Sneh=32, Shuru=31}	
		Map<String, Integer> m1 = Collections.synchronizedMap(map);
		
	}

}
