package logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class _30RomanNumberToInteger2 {
    public static void main(String[] args) {
        String input = "LVI";

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < input.length(); i++) {

            int current = map.get(input.charAt(i));

            if (i < input.length() - 1) {
                int next = map.get(input.charAt(i + 1));

                if (current < next) {
                    result -= current;
                } else {
                    result += current;
                }
            } else {
                result += current;
            }
        }
        System.out.println(result);
    }
}
