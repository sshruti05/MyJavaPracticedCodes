package stream.java.map;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Sneha", "Shruti", "Pri", "Shubham", "Mishika");
        List<String> newList = lists.stream().map(l -> l.toUpperCase()).collect(Collectors.toList());
//      or
        List<String> newList1 = lists.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(newList);
    }
}
/*
[SNEHA, SHRUTI, PRI, SHUBHAM, MISHIKA]
 */