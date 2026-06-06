package logicbuilding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class _26TwoSum {
    public static void main(String[] args) {
        int[] input = {1, 4, 3, 7, 5};
        int target = 8;
        int result [] = calculateTwoSum(input, target);
        System.out.println(result[0]+", "+result[1]);
        System.out.println(Arrays.toString(result));
    }

    private static int[] calculateTwoSum(int[] input, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<input.length; i++){
            int compliment = target-input[i];
            if(map.containsKey(compliment)){
                int result[] = {map.get(compliment),i};
                return result;
            }
            map.put(input[i], i);
        }
        return null;
    }
}
