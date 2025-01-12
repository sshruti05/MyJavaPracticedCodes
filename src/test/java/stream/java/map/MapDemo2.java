package stream.java.map;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

public class MapDemo2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 4, 5, 3 ,1);
        Optional<Integer> sum=list.stream().reduce(Integer::sum);
        System.out.println(sum.get());
    }
}
