package string;
import java.util.*;
public class LongestReapeatingSubstringWithoutReapeatingCharacters {
    public static void main(String[] args) {
        String s = "pwwkkevvewxpw";
        int maxLen = maxLengthWithoutRepeatingChars(s);
        System.out.println(maxLen);
    }
    public static int maxLengthWithoutRepeatingChars(String s){
        int maxLength = 0;
        int left=0;

        Set<Character> charSet = new HashSet<>();
        for(int right=0; right<s.length();right++) {
            while(charSet.contains(s.charAt(right))){
                charSet.remove(s.charAt(left));
                left++;
            }
            charSet.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}

