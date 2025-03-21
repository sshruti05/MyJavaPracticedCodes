package interview.map;

import java.util.*;
import java.util.stream.Collectors;

public class SortHashMapValue {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
        map.put("Sneha", 32);
        map.put("Ashu", 23);
        map.put("Pri", 54);

        System.out.println("TreeMap:- Sorted map based on Key: " + map);

        map.forEach((k,v)-> System.out.println(k+"\t"+v));
//          METHOD1:
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        List<Map.Entry<String, Integer>> entrySetList = new ArrayList<>(entrySet);
//
//        entrySetList.sort(new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o1.getValue().compareTo(o2.getValue());
//            }
//        });
//        System.out.println(entrySetList);
        // Sorting map entries by value using streams
//        System.out.println("Sorted by Value: " + sortedList);
//        METHOD2:
        List<Map.Entry<String, Integer>> sortedList = map.entrySet()
                .stream().sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toList());

        System.out.println("Sorted by Value: " + sortedList);

    }
}
