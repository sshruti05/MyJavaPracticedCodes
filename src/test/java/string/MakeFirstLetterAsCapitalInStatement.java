package string;

public class MakeFirstLetterAsCapitalInStatement {
    public static void main(String[] args) {
        String str = "Sneha shruti sing a song";
        String[] words = str.split(" ");
        StringBuffer result = new StringBuffer();
        for(String word : words) {
            if(!word.isEmpty()){
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1));
                result.append(" ");
            }
        }
        System.out.println(result.toString().trim()); //Sneha Shruti Sing A Song
    }
}