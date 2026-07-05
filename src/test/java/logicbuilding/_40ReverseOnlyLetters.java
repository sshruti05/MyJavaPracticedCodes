package logicbuilding;

public class _40ReverseOnlyLetters {
    public static void main(String[] args) {
        String input = "x1abc3";
        String result = reverseOnlyLetters(input);
        System.out.println(result);
    }

    private static String reverseOnlyLetters(String input) {
        char[] inputArr = input.toCharArray();
        StringBuffer sb = new StringBuffer();
        int left = 0;
        int right = input.length()-1;
        char temp;

        while (left<right){
            if(!Character.isLetter(inputArr[left]))
                left++;
            else if(!Character.isLetter(inputArr[right]))
                right--;
            else{
                temp = inputArr[left];
                inputArr[left] = inputArr[right];
                inputArr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(inputArr);

    }
}
