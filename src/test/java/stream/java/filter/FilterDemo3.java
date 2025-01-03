package stream.java.filter;
import java.util.ArrayList;
import java.util.List;

public class FilterDemo3 {
    private String name;
    private double salary;
    private int exp;

    public FilterDemo3(String name, double salary, int exp) {
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public static void main(String[] args) {
        List<FilterDemo3> l = new ArrayList<>();
        l.add(new FilterDemo3("Sneha", 2349383, 8));
        l.add(new FilterDemo3("Priyanka", 50000000, 11));
        l.add(new FilterDemo3("Sam", 600000000, 15));
        l.stream().filter(obj -> obj.salary>2500000).forEach(obj->System.out.println(obj.name+"  "+obj.salary));
    }
}
/*

Priyanka  5.0E7
Sam  6.0E8

 */