package other.string;
public class PalindromeString {
    public static void main(String[] args) {
        String s = "RAMAR";
        String original = s;
        String rev = "";
        for(int i=s.length()-1; i>=0; i--){
            rev = rev + s.charAt(i);
        }
        if(rev.equals(original)) {
            System.out.println("Palindrome: " + rev);
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
