package datastructure;

import java.util.HashSet;
import java.util.TreeSet;

import chapter06.Employee;

public class SetTest {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        System.out.println(set1.add("hello"));
        System.out.println(set1.add("hello"));
        System.out.println(set1.add("world"));
        System.out.println(set1.add("Uplus"));
        System.out.println(set1);

        Employee emp1 = new Employee("1", "1", 0);
        Employee emp2 = new Employee("1", "1", 0);
        System.out.println("emp1:" + emp1.hashCode());
        System.out.println("emp2:" + emp2.hashCode());
        System.out.println("emp2==emp1:" + (emp1 == emp2));

        HashSet<Employee> set3 = new HashSet<>();
        System.out.println(set3.add(emp1));
        System.out.println(set3.add(emp2));
        System.out.println(set3);

        TreeSet<String> set2 = new TreeSet<>();
        System.out.println(set2.add("ssafy"));
        System.out.println(set2.add("hello"));
        System.out.println(set2.add("world"));

        for (String str : set2) {
            System.out.println(str);
        }
    }
}
