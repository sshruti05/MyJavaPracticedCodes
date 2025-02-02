package string.replace;

public class ReplaceVowelByX {
    public static void main(String[] args) {
        String input = "india-INDIAN";
//        Method1:
//        String result = input.replaceAll("[aeiouAEIOU]", "X");
//        System.out.println(result); //XndXX-XNDXXN

//        Method2:
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toCharArray();
        for(char ch: chars){
            if(isVowel(ch)){
                sb.append('X');
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }


    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
