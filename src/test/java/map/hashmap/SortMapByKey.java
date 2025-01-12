package map.hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Sneha", 2);
        map.put("Shruti", 3);
        map.put("Pri", 6);
        map.put("Sam", 1);

        TreeMap<String, Integer> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap); //{Pri=6, Sam=1, Shruti=3, Sneha=2}
    }
}
