package stream.java.interview;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStream {
    public static void main(String[] args) {
        Stream.of("sneHa", "shRUti", "sONNNNNy").
                map(String::toLowerCase).
                map(s-> s.substring(0,1).toUpperCase()+s.substring(1)).
                forEach(System.out::println);
        /*
Sneha
Shruti
Sonnnnny
         */

        Stream.of(1.0, 2.0, 3.0).
                mapToInt(Double::intValue).
                mapToObj(i-> "a"+i).
                forEach(System.out::println);
        /*
        a1
        a2
        a3
         */

//        limit()
        Stream.iterate(1, n -> n+1).limit(10).forEach(System.out::println);

        IntStream.range(1,11).reduce(Integer::sum);

        OptionalDouble avg = Arrays.stream(new int[] {1,2,3,4,5,6,7,8}).average();
        System.out.println("Average: "+avg.getAsDouble());

        int sum = Arrays.stream(new int[] {1,2,3,4,5,6,7,8,9}).sum();
        System.out.println("SUM: "+sum);

        OptionalInt max = Arrays.stream(new int[] {1,2,3,4,5,6,7,8}).max();
        System.out.println("Max: "+max.getAsInt());

        long count = Arrays.stream(new int[] {1,2,3,4,5}).map(x->x*2+1).count();
        System.out.println("count: "+count);

    }
}
