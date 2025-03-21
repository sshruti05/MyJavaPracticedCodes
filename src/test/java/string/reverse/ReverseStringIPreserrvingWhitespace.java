package string.reverse;

import java.sql.SQLOutput;

public class ReverseStringIPreserrvingWhitespace {
    public static void main(String[] args) {
        String str = "internship at geeks for geeks";
        String reversedString = reverseStringPerverseWithWhitespace(str);
        System.out.println("Original String: "+str);
        System.out.println("Reversed String: "+reversedString);
    }
    private static String reverseStringPerverseWithWhitespace(String str) {
        char[] chars = str.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<chars.length; i++){
            if(chars[i] != ' '){
                sb.append(chars[i]);
            }
        }
        System.out.println("*** "+sb.toString());
        int index=0;
        sb.reverse();
        for(int i=0; i<chars.length; i++){
            if(chars[i] != ' '){
                chars[i] = sb.charAt(index);
                index++;
            }
        }
        return new String(chars);
    }
}