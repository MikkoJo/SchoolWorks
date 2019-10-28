package harjoitukset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import base.Employee;

public class PredicateTest {

	public static List<Employee> createEmployees() {

		Employee e1 = new Employee(39, "F", "Trace Kingston");
		Employee e2 = new Employee(13, "F", "Martina Hengis");
		Employee e3 = new Employee(49, "M", "Ricky Martin");
		Employee e4 = new Employee(16, "M", "Harold Tash ");
		Employee e5 = new Employee(59, "F", "Nanny Boatwright");
		Employee e6 = new Employee(15, "F", "Emmet Derby");
		Employee e7 = new Employee(19, "M", "Martie Mathews");
		Employee e8 = new Employee(47, "M", "Dean Ellison");
		Employee e9 = new Employee(56, null, null);
		Employee e10 = new Employee(null, "F", "Annie Frankie");
		Employee e11 = new Employee(null, null, null);

		List<Employee> employees = new ArrayList<Employee>();

		employees.addAll(Arrays.asList( //
				new Employee[] { e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11 }));

		return employees;

	}

//	public static Predicate<Employee> createPredicate () {
//		return;
//	}

	public static Predicate<Employee> isMale() {
		return e -> e.getGender() != null && 
				e.getAge() != null && 
				e.getGender().equalsIgnoreCase("M")
				&& e.getAge() >= 20;

	}

	public static Predicate<Employee> isFemale() {
		return e -> e.getGender() != null &&
				e.getAge() != null &&
				e.getGender().equalsIgnoreCase("F")
				&& e.getAge() >= 18;

	}

	public static Predicate<Employee> olderThan(int age) {
		return e -> e.getGender() != null &&
				e.getAge() != null &&
				e.getAge() > age;

	}

	public static Predicate<Employee> nameLongerThan(int length) {
		return e -> e.getGender() != null &&
				e.getName() != null &&
				e.getName().length() > length;

	}
	
	public static List<Employee> createFilteredList(Predicate<Employee> pre, 
													List<Employee> list) {
		return list.stream()
		.filter(Objects::nonNull)
		.filter(pre)
		.collect(Collectors.toList());

	}
	
	public static void main(String[] args) {
		List<Employee> employees = createEmployees();

		System.out.println("Henkilö on mies ja vähintään 20 vuotias");
		(createFilteredList(isMale(), employees)).forEach(System.out::println);;

		System.out.println("\nHenkilö on nainen ja vähintään 18 vuotias");
		(createFilteredList(isFemale(), employees)).forEach(System.out::println);;

		System.out.println("\nHenkilö on vanhempi kuin parametrina annettu ikä");
		(createFilteredList(olderThan(32), employees)).forEach(System.out::println);;
	
		System.out.println("\nHenkilön nimi on pidempi kuin  parametrina annetun nimen pituus");
		(createFilteredList(nameLongerThan(12), employees)).forEach(System.out::println);;

	}

}
