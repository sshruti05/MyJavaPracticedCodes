package string.reverse;

public class ReverseCasingOfString {
    public static void main(String[] args) {
        String input = "Hello Sneha";
        char[] ch = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c: ch){
            if(Character.isUpperCase(c)){
                sb.append(Character.toLowerCase(c));
            }else if( Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else{
                sb.append(c);
            }
        }
        System.out.println(sb);
    }
}
