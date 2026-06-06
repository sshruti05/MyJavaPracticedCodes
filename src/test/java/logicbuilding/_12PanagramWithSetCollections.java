package logicbuilding;


import java.util.HashSet;
import java.util.Set;

public class _12PanagramWithSetCollections {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";

        boolean result = checkPanagram(input);
        if(result){
            System.out.println("It's a panagram");
        }else{
            System.out.println("It's NOT a panagram");
        }
    }

    private static boolean checkPanagram(String input) {
        char[] chars = input.toLowerCase().toCharArray();
        Set<Character> set = new HashSet<>();

        for(char ch: chars){
            if(Character.isLetter(ch)){
                set.add(ch);
            }
        }

        if(set.size() == 26){
            return true;
        }

        return false;
    }
}
