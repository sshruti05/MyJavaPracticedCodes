package collection.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Person{
    int age;
    String name;

    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
public class SortClassTypeInList {
    public static void main(String[] args) {

        List<Person> l = new ArrayList<>();
        l.add(new Person(20, "Sneha"));
        l.add(new Person(62, "suru"));
        l.add(new Person(78, "pri"));
        l.add(new Person(33, "ananaya"));

        Collections.sort(l, Comparator.comparingInt(Person::getAge).reversed());
        System.out.println(l);
    }


}
