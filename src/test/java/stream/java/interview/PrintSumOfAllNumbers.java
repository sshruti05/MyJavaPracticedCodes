package stream.java.interview;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PrintSumOfAllNumbers {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        Optional<Integer> sum = list.stream().reduce(Integer::sum);
//        Optional<Integer> sum = list.stream().reduce( (a,b) -> a+b );
        Optional sum = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9).stream().reduce(Integer::sum);
        System.out.println("Sum of all numbers are: "+sum.get()); // Sum of all numbers are: 45
    }
}
