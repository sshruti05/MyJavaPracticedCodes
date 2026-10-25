package logicbuilding.linkedList;

import java.util.ArrayList;
import java.util.List;

/**
 * Input: a1b2c3
 * Output: a3b2c1
 */

public class _99_EYStringManipulation {
    public static void main(String[] args) {
        String str = "a1b2c3";

        System.out.println("Input:  "+str);

        List<Character> list = new ArrayList<>();

        for(char c: str.toCharArray())
        if(Character.isDigit(c)) {
            list.add(c);
        }
        int index = list.size()-1;
        StringBuilder sb = new StringBuilder();

        for(char c: str.toCharArray()) {
            if (Character.isDigit(c)){
                sb.append(list.get(index));
                index--;
            }else{
                sb.append(c);
            }
        }
        System.out.println("Output: "+sb.toString());


    }
}
