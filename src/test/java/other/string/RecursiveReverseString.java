package other.string;

public class RecursiveReverseString {
    public static void main(String[] args) {
        String str = "Hello Sneha Shruti.....";
        System.out.println(str.substring(1));
        System.out.println(reverseString(str));
    }

    public static String reverseString(String s) {
        if(s.isEmpty()){
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
}
