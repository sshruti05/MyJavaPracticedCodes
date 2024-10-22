package java8.lambdaExpression;

import java.util.TreeMap;

public class TreeMapLambda {
    public static void main(String[] args)
    {
        TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1 , o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        m.put(1, "Apple");
        m.put(4, "Mango");
        m.put(5, "Orange");
        m.put(2, "Banana");
        m.put(3, "Grapes");
        System.out.println("Elements of the TreeMap after sorting are : " + m);
        
        TreeMap<Integer, String> n = new TreeMap<>((a,b)-> b.compareTo(a));
        n.put(1, "Apple");
        n.put(4, "Mango");
        n.put(5, "Orange");
        n.put(2, "Banana");
        n.put(3, "Grapes");
        System.out.println("Elements of the TreeMap after sorting are : " + m);
    }

}
