package stream.java.streamBasics;

import java.util.*;
import java.util.stream.Stream;

public class StreamInitilization {
    public static void main(String[] args) {
//        1. Collection objects
        List<String> list = List.of();
        Stream<String> stream1 = list.stream();

//        2. Arrays  of values
        String[] arr = {"Abc", "Bcd", "Cde"};
        Stream<String> stream2 = Arrays.stream(arr);

//        3. Stream methods
        Stream<String> stream3 = Stream.of("Abc", "Bcd", "Cde");

//        4. generate()
        Stream<String> stream4 = Stream.generate(() -> "One");

//        5. builder()
//           Builder desing pattern
        Stream.Builder<String> streamBuilder = Stream.builder();
        Stream<String> stream5 = streamBuilder.add("One").add("Two").add("Three").build();

//        6. generate()
        Stream<String> stream6 = Stream.empty();
    }
}
