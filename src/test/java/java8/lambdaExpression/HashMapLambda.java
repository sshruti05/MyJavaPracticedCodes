package java8.lambdaExpression;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapLambda {
    public static void main(String[] args)
    {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap after sorting are : " + m);
       
    }

}
