package map.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupValuesInMap {
    public static void main(String[] args) {
        Map<String, List<String>> map = new HashMap<>();
        map.computeIfAbsent("Fruit", K -> new ArrayList<>()).add("Apple");
        map.computeIfAbsent("Fruit", K -> new ArrayList<>()).add("Mango");
        map.computeIfAbsent("Vegetables", K -> new ArrayList<>()).add("Tomato");
        System.out.println("Grouped Map: "+map); //  Grouped Map: {Vegetables=[Tomato], Fruit=[Apple, Mango]}
    }
}
