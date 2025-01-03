package collection.list.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        String[] arr = {"Sneha", "Shruti", "SOny", "Mishika", "Baby", "ANJ"};
        for(String name: arr){
            System.out.println(name);
        }
        ArrayList<String> al = new ArrayList<>(Arrays.asList(arr));
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al, Collections.reverseOrder());
        System.out.println(al);
        System.out.println(Collections.max(al));
    }
}
/*
Sneha
Shruti
SOny
Mishika
Baby
ANJ
[Sneha, Shruti, SOny, Mishika, Baby, ANJ]
[ANJ, Baby, Mishika, SOny, Shruti, Sneha]
[Sneha, Shruti, SOny, Mishika, Baby, ANJ]
Sneha
 */