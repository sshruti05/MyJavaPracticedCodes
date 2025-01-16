package interview.occurance;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

public class OccuranceOfElementInArrayUsingHashMap {
    private static void findElemntUsingHashMap(int[] ints) {
        System.out.println(Arrays.toString(ints));
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : ints){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }
        System.out.println(map);
    }
    public static void main(String[] args) {
        findElemntUsingHashMap(new int[]{1,2,3,2,5,2,6,2,4,3,6,1});
    }


}
