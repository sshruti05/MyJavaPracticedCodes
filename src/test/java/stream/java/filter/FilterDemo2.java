package stream.java.filter;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterDemo2 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("Sneha", null, "Pri", "Jais", null, "Mishika");
        List<String> wordWithoutNull = words.stream().filter(w -> w!=null).collect(Collectors.toList());
//        or
        List<String> wordWithoutNull1 = words.stream().filter(Objects::nonNull).collect(Collectors.toList());
        System.out.println(wordWithoutNull);
        System.out.println(wordWithoutNull1);
    }
}
