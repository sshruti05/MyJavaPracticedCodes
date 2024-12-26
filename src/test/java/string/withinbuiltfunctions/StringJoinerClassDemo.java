package string.withinbuiltfunctions;

import java.util.StringJoiner;

public class StringJoinerClassDemo {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Sneha");
        stringJoiner.add("Shruti");
        stringJoiner.add("Chhoti");
        System.out.println(stringJoiner);
        String result = stringJoiner.toString();
        System.out.println(result);
    }
}
