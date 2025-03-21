package map.list;
import java.util.*;
public class TwoListCombination {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("I", "L", "y", "H", "J", "O","P", "R");  // Increased elements in list1
        List<String> list2 = Arrays.asList("am", "ove", "ou", "so", "much", "Sneha", "shhsjdksj", "djks", "dsjkdj");
        List<String> result = new ArrayList<>();
        int maxSize = Math.max(list1.size(), list2.size());
        for(int i=0; i<maxSize; i++){
            String combinedStr="";
            if(i<list1.size()){
                combinedStr += list1.get(i);
            }
            if(i<list2.size()){
                combinedStr += list2.get(i);
            }
            result.add(combinedStr);
        }
        System.out.println(result);
    }
}
