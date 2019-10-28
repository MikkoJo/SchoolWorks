package basic.basic2functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import base.Person;
import base.Worker;

public class DerivedClassArrayFunctionalDemo {

    public static void main(String[] args) {
        Person bill = new Person("A321", "Bill");
        Worker steven = new Worker("B123", "Steven", 40, 25);

        Worker billInWork = new Worker(bill.getId(), bill.getName(), 19.95, 30);
        List<Person> persons = List.of(bill, billInWork, steven);
        persons.forEach(System.out::println);
        steven.setHourSalary(99);        
        persons.forEach(System.out::println);

        ArrayList<Person> persons2 = new ArrayList<>(persons);

        System.out.println("Filter");
        persons2.stream().filter(p -> p.getName().startsWith("B")).forEach(System.out::println);
//        persons2.forEach(System.out::println);
        System.out.println();
        Predicate<Person> startsB = p -> p.getName().startsWith("S");
        persons2.stream().filter(startsB).forEach(System.out::println);
//        Worker billInWork = new Worker();
//        billInWork.setId(bill.getId());
//        billInWork.setName(bill.getName());
//        billInWork.setHourSalary(19.95);
//        billInWork.setWorkingHours(30);

//        java.util.ArrayList<Person> persons = new java.util.ArrayList<>();
//        persons.add(bill);
//        persons.add(billInWork);
//        persons.add(steven);
        System.out.println("Printing all persons from ArrayList:");
//        for (Person p : persons) {
//            System.out.println(p);
//        }
//        List<Person> persons = List.of(bill, billInWork, steven);
//        persons.forEach(System.out::println);
//        persons.forEach(System.out::println);
        
    }
}
