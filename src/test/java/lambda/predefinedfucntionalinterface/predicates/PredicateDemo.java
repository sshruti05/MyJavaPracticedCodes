package lambda.predefinedfucntionalinterface.predicates;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> p = i -> i>4;
        System.out.println(p.test(3)); //false
        System.out.println(p.test(6)); //true

        Predicate<String> p1 = s ->  s.length() > 4;
        String[] names = {"Sneha", "Shruti", "neha", "it", "Jannu"};
        for(String name: names){
            if(p1.test(name)){
                System.out.println(name);
            }
        }
    }
}
