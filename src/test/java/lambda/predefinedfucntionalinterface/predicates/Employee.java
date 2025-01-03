package lambda.predefinedfucntionalinterface.predicates;

import java.util.ArrayList;
import java.util.function.Predicate;
//PredicateDemoWithObjectsInLambda
public class Employee {
    private String name;
    private int salary;
    private double exp;

    public Employee(String name, int salary, double exp){
        this.name = name;
        this.salary = salary;
        this.exp = exp;
    }

    public static void main(String[] args) {
        Predicate<Employee> p = obj -> obj.salary>40000 && obj.exp>3;

        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Pri", 200000, 11));
        al.add(new Employee("Sneha", 150000, 7.10));
        al.add(new Employee("Jaiswal", 10000000, 6));
        al.add(new Employee("Mishika", 35000, 2));

        for(Employee emp : al){
            if(p.test(emp)){
                System.out.println(emp.name+" "+emp.salary);
            }
        }
    }
}
/*
Pri 200000
Sneha 150000
Jaiswal 10000000
 */
