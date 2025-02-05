package string;

public class ToggleStringCharacter {
    public static void main(String[] args) {
        String input = "Sneha SHruTI.";
//        Method1:
        StringBuffer result = new StringBuffer();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }
        System.out.println("Input" + input);
        System.out.println("Result " + result);
    }
}

