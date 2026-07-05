package logicbuilding;

import java.util.Arrays;

public class _39ReverseOnlyVowelsInAString {
    public static void main(String[] args) {
        String input = "Hello Sneha";
        reverseVowels(input);
    }

    private static void reverseVowels(String input) {
        char[] inputArr = input.toCharArray();
        String vowel = "aeiouAEIOU";
        int left = 0;
        int right = input.length()-1;
        char temp;

        while(left<right){
            if( vowel.indexOf(inputArr[left]) == -1 ){
                left++;
            }
            else if( vowel.indexOf(inputArr[right]) == -1 ){
                right--;
            }
            else {
                temp = inputArr[left];
                inputArr[left] = inputArr[right];
                inputArr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(inputArr));
    }
}
/*
Output:
Holle
 */
