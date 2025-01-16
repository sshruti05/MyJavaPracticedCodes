package interview.occurance;

import java.util.HashMap;
import java.util.Map;

public class OccuranceOfElementInStringUsingHashMap {

    private static void findOccuranceOfCharInStringUsingHashMap(String s) {
        System.out.println(s);
        Map<Character, Integer> map = new HashMap<>();
        for (char c:s.toLowerCase().toCharArray()){
            if(c>='a' && c<='z'){
                if(map.containsKey(c)){
                    map.put(c, map.get(c)+1);
                }else{
                    map.put(c, 1);
                }
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        findOccuranceOfCharInStringUsingHashMap(new String("Hi hello Khana Kha ke jana."));
    }
}
