package logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class _23FrequencyOfCharactersInString {
    public static void main(String[] args) {
        String input = "Hello Sneha";
        Map<Character, Integer> map = new HashMap<>();

        char[] inputArray = input.toLowerCase().toCharArray();

        for(char c : inputArray){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        System.out.println(map);

        for(char c: map.keySet()){
            System.out.println(c+" : "+map.get(c));
        }
    }
}
