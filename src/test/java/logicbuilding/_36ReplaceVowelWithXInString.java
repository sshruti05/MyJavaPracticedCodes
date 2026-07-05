package logicbuilding;

public class _36ReplaceVowelWithXInString {
    public static void main(String[] args) {
        String input = "Sneha Iconic U";
        char[] charArray = input.toLowerCase().toCharArray();
        StringBuilder sbNewString = new StringBuilder();

        for(char c: charArray){
            if(c=='a' || c=='e' || c=='i' || c=='o' ||c=='u'){
                sbNewString.append('X');
            }else{
                sbNewString.append(c);
            }
        }
        System.out.println("Result is : "+sbNewString.toString());
    }
}
