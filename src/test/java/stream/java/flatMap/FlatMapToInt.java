package stream.java.flatMap;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMapToInt {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6  ,7 ,8, 9};

        Stream<int[]> s = Stream.of(num);
        IntStream intStream = s.flatMapToInt(Arrays::stream);
        OptionalInt result = intStream.reduce(Integer::sum);
        System.out.println(result.getAsInt());
    }
}
