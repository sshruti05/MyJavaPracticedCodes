package logicbuilding;
// Find occurance of 'o' in the string;
public class _38FindFirstAndLastOccuranceOfACharacterInString {
    public static void main(String[] args) {
        String input = "Hello World!";

        int firstIndex = -1;
        int lastIndex = -1;

        for(int first=0; first<input.length(); first++) {
            if (input.toLowerCase().charAt(first) == 'o') {
                firstIndex = first;
                break;
            }
        }
        for(int last=input.length()-1; last>=0; last--){
            if(input.toLowerCase().charAt(last) == 'o'){
                lastIndex = last;
                break;
            }
        }
        System.out.println("First occurance index: "+firstIndex);
        System.out.println("Last occurance index: "+lastIndex);
    }
}
/*
Output:
First occurance index: 4
Last occurance index: 7
 */