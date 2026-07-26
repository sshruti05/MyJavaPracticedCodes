package logicbuilding;

public class _48_CountUpperLowerCharactersInString {
    public static void main(String[] args) {
        String input = "abDFEiklHje";
        char[] data = input.toCharArray();
        int lowerCount = 0;
        int upperCount = 0;
        for(char c: data){
            if(Character.isLowerCase(c))
                lowerCount++;
            if(Character.isUpperCase(c))
                upperCount++;
        }
        System.out.println("Upper Case Count is: "+upperCount);
        System.out.println("Lower Case Count is: "+lowerCount);

    }
}
