package logicbuilding;

public class _7FindLengthOfLastWordInStringWithoutTrim {
    public static void main(String[] args) {
        String input = "     Sneha    Shruti    Jaiswal   abc   ";
        char[] inputArray = input.toCharArray();
        int lastWordLength = 0;
        for(int i=inputArray.length-1; i>0; i--){
            if(inputArray[i] != ' '){
                lastWordLength++;
            }else{
                if( lastWordLength > 0 ){
                    System.out.println(lastWordLength);
                    break;
                }
            }
        }
    }
}
