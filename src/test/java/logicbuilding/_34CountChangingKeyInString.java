package logicbuilding;

public class _34CountChangingKeyInString {
    public static void main(String[] args) {
        String input = "AbBccCde";//4 "abBccCde";//4  "aAAaa";//0
        int count = 0;
        char[] inputArray = input.toCharArray();
        char lastKey = Character.toLowerCase(inputArray[0]);

        for(int i=1; i<inputArray.length; i++){
            char currentKey = Character.toLowerCase(inputArray[i]);
            if(lastKey != currentKey){
                count += 1;
            }
            lastKey = currentKey;
        }
        System.out.println("Changing key count is: "+ count);
    }
}
