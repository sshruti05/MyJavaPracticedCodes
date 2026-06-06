package logicbuilding;

public class _28CountOfVowelsInString {
    public static void main(String[] args) {
        String input = "Sa re ga ma pa dha ni sa";

        String vowels = "aeiouAEIOU";
        int count = 0;
        for(char c: input.toCharArray()){
            if(vowels.indexOf(c) != -1){
                count++;
            }
        }
        if(count>0) {
            System.out.println("Found vowel counts are: "+count);
        }else{
            System.out.println("No vowel found!!!");
        }
    }
}
