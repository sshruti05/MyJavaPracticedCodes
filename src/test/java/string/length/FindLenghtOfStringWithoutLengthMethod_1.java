package string.length;

public class FindLenghtOfStringWithoutLengthMethod_1 {
    public static void main(String[] args) {
        String input = "Sneha Shruuti";
        int count = 0;
        for(char c: input.toCharArray()){
            count++;
        }
        System.out.println("Length of String is: "+count);
    }
}
