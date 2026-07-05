package logicbuilding;

import java.util.Stack;
/*
        | Banana| 1 position => search()
        | Kiwi  | 2 position
        |_Mango_| 3 position

 */

public class _31StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Mango");
        stack.push("Kiwi");
        stack.push("Banana");

        System.out.println(stack.search("Banana")); //1
        System.out.println(stack.search("Kiwi")); //2
        System.out.println(stack.search("Mango")); //3
        System.out.println(stack.search("Sneha")); //-1
        System.out.println(stack.search("mango")); //-1

        System.out.println(stack); //[Mango, Kiwi, Banana]
        System.out.println(stack.peek()); //Banana (only to see what's on the top)
        System.out.println(stack); //[Mango, Kiwi, Banana]
        System.out.println(stack.pop()); //Banana (to see what's on the top and to remove that element)
        System.out.println(stack); //[Mango, Kiwi]
        System.out.println(stack.isEmpty()); //false
        stack.pop(); //Kiwi
        stack.pop(); //Mango
        System.out.println(stack.isEmpty()); //true

    }
}
