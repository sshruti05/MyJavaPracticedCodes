package string;

public class PalindromeStringCheck {
    public static void main(String[] args) {
        String s = "Madam";
        String str = s.toLowerCase();
        boolean isPalindrome = true;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println(str+": is a palindrome");
        else
            System.out.println(str+": is NOT a palindrome");
    }
}
