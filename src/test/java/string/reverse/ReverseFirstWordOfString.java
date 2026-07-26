package string.reverse;

public class ReverseFirstWordOfString {
    public static void main(String[] args) {
        String input = "World is going crazy these days."; // dlroW is going crazy these days.
//        String input = ""; // String is empty and cant be reversed
//        String input = "hi"; // ih

        reverseFirstWord(input);
    }

    private static void reverseFirstWord(String input) {
        if( input.isEmpty() || input ==null ){
            System.out.println("String is empty and cant be reversed");
        }
        else{
            String[] words = input.split(" ", 2);
            char[] firstWordChar = words[0].toCharArray();
            int left = 0;
            int right = words[0].length()-1;
            char temp;
            while (left<right) {
                temp = firstWordChar[left];
                firstWordChar[left] = firstWordChar[right];
                firstWordChar[right] = temp;
                left++;
                right--;
            }
            if(words.length==1){
                System.out.println(new String(firstWordChar));
            }else {
                System.out.println(new String(firstWordChar) + " " + words[1]);
            }
        }

    }
}
