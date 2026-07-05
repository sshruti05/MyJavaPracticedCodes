package logicbuilding;

public class _35SeperateNumbersAndAlphabetsFromAlphaNumericString {
    public static void main(String[] args) {
        String input = "1Sn3e5h44a2";
        char[] inputArray = input.toCharArray();
        StringBuilder sbAlphabet = new StringBuilder();
        StringBuilder sbNumeric = new StringBuilder();

        for(char c: inputArray) {
            if (c >= '0' && c <= '9') {//if(Character.isDigit(c)){
                sbNumeric.append(c);
            } else if (Character.isAlphabetic(c)) { //if (Character.isLetter(c)) {
                sbAlphabet.append(c);
            }
        }
        System.out.println("Alpabets are: "+sbAlphabet);
        System.out.println("Numerics are: "+sbNumeric);
    }
}
