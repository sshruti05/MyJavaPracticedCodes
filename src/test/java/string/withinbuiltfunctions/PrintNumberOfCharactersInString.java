package string.withinbuiltfunctions;

import java.util.HashMap;
import java.util.Map;

public class PrintNumberOfCharactersInString {

	public static void main(String[] args) {
		String str = "india";
		char[] chars = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for(char ch : chars){
			map.put(ch, map.getOrDefault(ch,0)+1);
		}
		for(Character key:map.keySet()){
			System.out.println(key+" "+map.get(key));
		}
//		for(Map.Entry<Character, Integer> entry: map.entrySet()){
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
	}
}
