package string.reverse;
import java.util.Arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String input = "12abcd249";
        char[] inputCharArray = input.toCharArray();
        int left = 0;
        int right = input.length()-1;

        while(left<right){
            if(!Character.isLetter(inputCharArray[left])){
                left++;
            }else if(!Character.isLetter(inputCharArray[right])){
                right--;
            }else{
                char temp = inputCharArray[left];
                inputCharArray[left] = inputCharArray[right];
                inputCharArray[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(inputCharArray)); //[1, 2, d, c, b, a, 2, 4, 9]
        System.out.println(new String(inputCharArray)); //12dcba249x


    }
}
