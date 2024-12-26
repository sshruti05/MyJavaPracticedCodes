package string.withoutinbuiltfunction;

public class StringUpperCaseToLowerCase {
/*
A=65 to Z=90
a=97 to z=122
 */
//    Method1:
//    public static String toLowerCase(String s){
//        char[] c = s.toCharArray();
//        for(int i=0; i<c.length; i++){
//            if(c[i]>=65 && c[i]<=90){
//                c[i] = (char) (c[i] + 32);
//            }
//        }
//        return String.valueOf(c);
//    }

//    Method2: But this is not ideal as this will keep creating new String in constant pool.
//    public static String toLowerCase(String s){
//        String result="";
//        for(int i=0; i<s.length(); i++) {
//            if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
//                result += (char)(s.charAt(i)+32);
//            }
//            else{
//                result += s.charAt(i);
//            }
//        }
//        return result;
//    }

//    Method3:
    public static String toLowerCase(String s){
        StringBuilder sb = new StringBuilder();
        for(char c: s.toCharArray()) {
            if (c >= 65 && c <= 90) {
                c += 32;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String input  = "Sneha ShRuti IS a Big STAR *****.";
        System.out.println(toLowerCase(input));
    }
}
