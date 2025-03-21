package array.code.sort;
import java.util.*;

/*
Arrays class provides three shorting methods:
1. public static void sort(primitive[] p)
2. public static void sort(Object[] o)
3. public static void sort(Object[] o, Comparator c)
 */
public class ArraysSortPractice {
    public static void main(String[] args) {
        System.out.println("*********Method1***********\n");
        int[] a = {10, 3, 5, 2, 6, 4};
        Arrays.sort(a);
        for(int a1: a){
            System.out.print(a1+" "); // 2 3 4 5 6 10
        }
        System.out.println("\n*********Method2***********");
        String[] s = {"Abc", "Zwhadn", "Cdfd"};
        Arrays.sort(s);
        System.out.println();
        for(String s1: s){
            System.out.print(s1+ " ");
        }
        System.out.println("\n*********Method3***********");
        String[] strs = {"asd", "zdfs", "dsgd"};
//        Arrays.sort(strs, new MyComparator());
        Arrays.sort(strs, (o1,o2)-> o2.compareTo(o1));
        for(String str: strs){
            System.out.print(str+" "); //zdfs dsgd asd
        }
    }
}
class MyComparator implements Comparator<Object>{
//    @Override
//    public int compare(String o1, String o2) {
////        return o1.compareTo(o2); // natural order: asd dsgd zdfs
//        return o2.compareTo(o1); // reverse order : zdfs dsgd asd
//    }

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}