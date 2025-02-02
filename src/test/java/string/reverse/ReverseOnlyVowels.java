package string.reverse;

import java.util.Arrays;

public class ReverseOnlyVowels {
    public static void main(String[] args) {
        String input = "EHelloiM";
        char[] inputArray = input.toCharArray();
        int left = 0;
        int right = input.length()-1;
        String vowels = "aeiouAEIOU";

        while(left<right){
            if(vowels.indexOf(inputArray[left])==-1){
                left++;
            }else if(vowels.indexOf(inputArray[right])==-1){
                right--;
            }else{
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(new String(inputArray)); //iHolleEM
        System.out.println(Arrays.toString(inputArray)); //[i, H, o, l, l, e, E, M]
    }
}
