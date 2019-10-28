package harjoitukset;

import base.Employee;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;

public class OptionalTest {

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

	List<Employee> employees;

	@Before
	public void setUp() throws Exception {
		employees = createEmployees();
	}

	@Test
	public void testTraditional() {
		for (Employee employee : employees) {
			if(employee.getAge() != null) {
				System.out.println(employee);
			}
		}
	}

	@Test
	public void testOptional() {
		Optional<List<Employee>> optEmplyees = Optional.of(employees);
		
	}

}
