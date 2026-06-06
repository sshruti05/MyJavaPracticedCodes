package logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class _24FrequencyOfSpecialCharactersInString {
    public static void main(String[] args) {
        String input = "s@Shruti12#2@!";

        char[] inputArray = input.toLowerCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : inputArray){
            if(!(c>='a' && c<='z' || c>='A' && c<='Z' || c>='0' && c<='9' || c==' ')) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
//        for(char c: map.keySet()){
//            System.out.println(c+" : "+map.get(c));
//        }
        for(Map.Entry<Character, Integer> entries: map.entrySet()){
            System.out.println(entries.getKey()+" "+ entries.getValue());
        }
    }
}
