package logicbuilding;

import java.util.Arrays;

public class _32TwoStringsAsAnagramCheck {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "Listen";

        char[] c1 = s1.toLowerCase().toCharArray();
        char[] c2 = s2.toLowerCase().toCharArray();

        if(c1.length == c2.length){
            Arrays.sort(c1);
            Arrays.sort(c2);
            if(Arrays.equals(c1, c2)){
                System.out.println("Two strings are anagaram");
            }else{
                System.out.println("Two strings are NOT anagram");
            }
        }else
            System.out.println("Two strings are NOT anagram");
    }
}
