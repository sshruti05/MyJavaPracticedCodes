package stream.java.filter;

import java.util.Arrays;
import java.util.List;

public class StreamFilter_FIndAnyOrElse {

    public static void main(String[] args) {
        List<Customer> cList = Arrays.asList(
                new Customer("Sneha", 23),
                new Customer("Priyanka", 22),
                new Customer("Sam", 25));

        Customer cObj = cList.stream()
                .filter(c-> c.getName().equals("Priyanka"))
                .findAny()
                .orElse(null);

        assert cObj != null;
        System.out.println(cObj.getName()+"------"+cObj.getAge());
    }
}
