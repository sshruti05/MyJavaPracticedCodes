package logicbuilding;

import java.util.HashMap;
import java.util.Map;

public class _30RomanNumberToInteger {
    public static void main(String[] args) {
        String input = "XXX";
        int previousValue = 0;
        int result = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);

        for( int i=input.length()-1; i>=0; i--){
            char currentCharacter = input.charAt(i);
            int currentValue = romanMap.get(currentCharacter);

            if(currentValue >= previousValue){
                result = result + currentValue;
            }else{
                result = result - currentValue;
            }
            previousValue = currentValue;
        }
        System.out.println(input+" : "+result);
    }
}
