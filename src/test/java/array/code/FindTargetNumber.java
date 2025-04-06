package array.code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTargetNumber {
    public static void main(String[] args) {
        int[] nums = {2,4,8,3,1,7,1,11,15};
        int target = 9;
//        Method1:
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target){
                    System.out.println(Arrays.toString(new int[]{i, j}));
                }
            }
        }
//        Method2:
        System.out.println("**********Method2**************");
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){ //{2,4,8,3,1,7,1,11,15}
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                System.out.println(Arrays.toString(new int[]{map.get(diff), i}));
            }
            map.put(nums[i], i);
        }
    }
}
