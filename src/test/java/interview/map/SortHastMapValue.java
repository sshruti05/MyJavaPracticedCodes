package interview.map;

import java.util.*;

public class SortHastMapValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
        map.put("Sneha", 32);
        map.put("Ashu", 23);
        map.put("Pri", 54);

        System.out.println("TreeMap:- Sorted map based on Key: " + map);

        map.forEach((k,v)-> System.out.println(k+"\t"+v));

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        List<Map.Entry<String, Integer>> entrySetList = new ArrayList<>(entrySet);

        entrySetList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        System.out.println(entrySetList);


    }
}
