package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,10,4,6,1,2,3,4,5,6);

//        int sum = list.stream().reduce(0, (a,b)->a+b); //Sum is: 21
//        int sum = list.stream().reduce(0,Integer::sum); //Sum is: 21
        int sum = list.parallelStream().reduce(0,Integer::sum); //Sum is: 21
        System.out.println("Sum is: "+sum);

        List<Integer> sortedList = list.stream().sorted().collect(Collectors.toList());
        List<Integer> reverseSortedList = list.stream().
                                        sorted((o1,o2)-> o2.compareTo(o1)).
                                        collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println(reverseSortedList);



    }
}
