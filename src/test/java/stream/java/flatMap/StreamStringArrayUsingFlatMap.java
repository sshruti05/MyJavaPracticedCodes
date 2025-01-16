package stream.java.flatMap;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamStringArrayUsingFlatMap {
    public static void main(String[] args) {
        String[][] arr = new String[][]{
                {"a","b"},
                {"c","d"},
                {"e","f"}
        };

        Stream<String[]> strArray = Arrays.stream(arr);
        Stream<String> srtFlatMap= strArray.flatMap(Arrays::stream);
        srtFlatMap.filter(x-> x.equals("a")).forEach(System.out::println);
    }
}
