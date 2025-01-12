package map.hashmap;
import java.util.HashMap;
import java.util.Map;

public class SortMapByValueWithoutStream {
    public static void main(String[] args) {
        Map<String, Integer>  map = new HashMap<>();
        map.put("Sneha", 2);
        map.put("shruti", 3);
        map.put("pri", 6);
        map.put("Sam", 1);

        for(String key: map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        for(Integer value: map.values()){
            System.out.println(value);
        }

    }
}
