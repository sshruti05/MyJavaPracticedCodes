package logicbuilding;

import java.util.LinkedHashSet;
import java.util.Set;

public class _8RemoveDuplicateCharactersFromString {
    public static void main(String[] args) {
        String input = "Saja java";
        char[] inputCharArray = input.toLowerCase().toCharArray();

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder duplicateChars = new StringBuilder();

        for(char ch: inputCharArray){
            if(ch == ' ')
                continue;
            if(set.contains(ch)){
                duplicateChars.append(ch);
            }else{
                set.add(ch);
            }
        }
        System.out.println("Unique string char are: "+set);
        System.out.println("Found duplicate charcters are: "+duplicateChars);
        System.out.println("Duplicate count are: "+String.valueOf(duplicateChars).length());
    }
}
