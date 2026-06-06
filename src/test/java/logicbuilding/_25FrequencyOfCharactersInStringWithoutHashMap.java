package logicbuilding;

import java.util.Arrays;

public class _25FrequencyOfCharactersInStringWithoutHashMap {
    public static void main(String[] args) {
        String input = "s#erh@34sdjs#";
        char[] inputArray = input.toLowerCase().toCharArray();

        int[] frequency = new int[256];
        for(char ch: inputArray){
            frequency[ch] = frequency[ch]+1;
        }
        for(int i=0; i<frequency.length; i++){
            if(frequency[i] > 0){
                System.out.println((char) i+" "+frequency[i]);
            }
        }
    }
}
