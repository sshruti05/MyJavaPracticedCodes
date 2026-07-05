package logicbuilding;

import java.util.Stack;

public class _31_1ValidParenthesis {
    public static void main(String[] args) {
        String input = "(())";
        if(checkParenthesis(input)){
            System.out.println("Parenthesis is BALANCED");
        }else{
            System.out.println("Parenthesis is NOT BALANCED");
        }
    }

    private static boolean checkParenthesis(String input) {
        char[] inputArray = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for(char currentChar: inputArray){
            if(currentChar == '(' || currentChar == '{' || currentChar == '['){
                stack.push(currentChar);
            }else {
                if(stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if(currentChar == ')' && topChar != '('){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
