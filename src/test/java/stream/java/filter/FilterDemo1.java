package stream.java.filter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterDemo1 {
    public static void main(String[] args) {
        String[] arr = {"Sneha", "Shruti", "Venus", "Pri", "Harsha"};
        List<String> l = Arrays.asList(arr);
        System.out.println(l); // [Sneha, Shruti, Venus, Pri, Harsha]

        List<String> newList = l.stream().filter(n -> n.length()>=3 && n.length()<=5).
                                collect(Collectors.toList());
        System.out.println(newList); // [Sneha, Venus, Pri]

        l.stream().filter(n -> n.length()>=3 && n.length()<=5).forEach(str -> System.out.println(str));
        //or
        l.stream().filter(n -> n.length()>=3 && n.length()<=5).forEach(System.out::println);
        /*
            Sneha
            Venus
            Pri
         */
    }
}
/*

[Sneha, Shruti, Venus, Pri, Harsha]
[Sneha, Venus, Pri]
Sneha
Venus
Pri
Sneha
Venus
Pri

 */