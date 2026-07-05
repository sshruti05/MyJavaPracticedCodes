package stream.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {
//        5 WAYS TO CREATE STREAM OBJECTS:
        // Method1: Blank Stream object
        Stream streamObj = Stream.empty();
        streamObj.forEach(e-> System.out.println("***"+e)); // nothing will be printed

        // Method2: array, object, collection
        String[] names = {"Sneha", "Prianka", "Amar", "Seema", "Sonu"};
        Stream<String> stream1 = Stream.of(names);// In place of names we can pass array, object, collection
        stream1.filter(s -> s.charAt(0) == 'S')
                .forEach(e -> System.out.print(e+" ")); //Sneha Seema Sonu

        // Method 3: Using stream builder
        Stream stream = Stream.builder().build();

        //Method 4:
        IntStream intStream = Arrays.stream(new int[]{2,4, 65, 2, 4, 10, 43});
        intStream.forEach(e-> System.out.print(e+" "));//2 4 65 2 4 10 43

        // Method 5: List, Set
        List<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(90);
        list.add(70);
        list.add(50);
        list.add(10);

        list.stream().forEach(l -> System.out.print(l+" ")); //30 90 70 50 10
    }
}
