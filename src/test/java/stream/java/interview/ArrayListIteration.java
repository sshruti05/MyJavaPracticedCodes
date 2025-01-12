package stream.java.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListIteration {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Games of Thorn");
        l.add("Mircoscope");
        l.add("Maha Lami");
        l.add("Good Dinasorus");

        System.out.println("Method1: Using forEach()-----------------> " );
        l.forEach(System.out::println);

        System.out.println("Method2: Using Iterator-----------------> " );
        Iterator<String> it = l.iterator();
        while (it.hasNext())
            System.out.println(it.next());

        System.out.println("Method3: Using Java8 forEachRemaining-----------------> " );
        l.iterator().forEachRemaining(System.out::println);

        System.out.println("Method4: Simple For each loop-----------------> " );
        for(String x:l){
            System.out.println(x);
        }

        System.out.println("Method5: Using for loop------------------> ");
        for(int i=0; i<l.size(); i++){
            System.out.println(l.get(i));
        }

        System.out.println("Method6: Using for listIterator in reverse order------------------> ");
        ListIterator<String> li = l.listIterator(l.size());
        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

    }
}
