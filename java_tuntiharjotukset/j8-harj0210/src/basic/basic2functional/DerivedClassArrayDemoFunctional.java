package basic.basic2functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import base.Person;
import base.Worker;

public class DerivedClassArrayDemoFunctional {
	public static void main(String[] args) {
		Person bill = new Person("A321", "Bill");
		Worker steven = new Worker("B123", "Steven", 40, 25);
		Worker billInWork = new Worker(bill.getId(), bill.getName(), 19.95, 30);

		// unmodifiable list! Sopii funktionaaliseen ohjelmointiin paremmin
		List<Person> persons = List.of(bill, steven, billInWork);

		// modifiable list! Sopii olio-ohjelmointiin paremmin
		List<Person> newPersons = new ArrayList<>(persons);
		newPersons.add(new Person("A357", "Jill"));
		newPersons.add(new Person("A789", "Jane"));

		System.out.println("Printing all persons from ArrayList:");
		newPersons.stream().forEach(System.out::println);
		
		System.out.println("Printing starts with J:");
		newPersons.stream().filter(p -> p.getName().startsWith("J")).forEach(System.out::println);

		System.out.println("Printing starts with B:");
		Predicate<Person> startsB = p -> p.getName().startsWith("B");
		newPersons.stream().filter(startsB).forEach(System.out::println);

	}
}
