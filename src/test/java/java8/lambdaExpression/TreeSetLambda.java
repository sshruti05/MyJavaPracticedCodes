package java8.lambdaExpression;

import java.util.TreeSet;

public class TreeSetLambda {
    public static void main(String[] args)
    {
        TreeSet<Integer> h = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        h.add(850);
        h.add(235);
        h.add(1080);
        h.add(15);
        h.add(5);
        System.out.println("Elements of the TreeSet after sorting are: " + h+"\n*******************************");
        
        TreeSet<Integer> h1 = new TreeSet<Integer>((a,b)-> b.compareTo(a));
        h1.add(850);
        h1.add(235);
        h1.add(1080);
        h1.add(15);
        h1.add(5);
        System.out.println("Elements of the TreeSet after sorting are: " + h);
    }

}
