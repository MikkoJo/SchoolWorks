package harjoitukset;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

import org.junit.Before;
import org.junit.Test;

import base.User;

public class IntSummaryStatisticsTest {

	List<User> users;
	private static final double DELTA = 1e-15;
	
	@Before
	public void setUp() {
		users = Arrays.asList(
			new User("jack", 40),
			new User("john", 32),
			new User("jill", 47),
			new User("mike", 28),
			new User("bob", 51));

	}
	
	@Test
	public void ageTest() {
		int sum = 0;
		int minAge = Integer.MAX_VALUE;
		int maxAge = 0;
		for(User u: users) {
			sum += u.getAge();
			if(minAge > u.getAge()) minAge = u.getAge();
			if(maxAge < u.getAge()) maxAge = u.getAge();
		}
		double avg = (double)sum / users.size();
		assertEquals(198, sum);
		assertEquals(39.6, avg, DELTA);
		assertEquals(28, minAge);
		assertEquals(51, maxAge);
	}

	@Test
	public void ageFunctionalTest() {
//		int sum = 0;
//		int minAge = Integer.MAX_VALUE;
//		int maxAge = 0;
		IntSummaryStatistics stats = users
				.stream()
				.collect(Collectors.summarizingInt(User::getAge));
		IntSummaryStatistics stats2 = users
				.stream().mapToInt(User::getAge).summaryStatistics();
		assertEquals(198, stats.getSum());
		assertEquals(39.6, stats.getAverage(), DELTA);
		assertEquals(28, stats.getMin());
		assertEquals(51, stats.getMax());
		assertEquals(198, stats2.getSum());
		assertEquals(39.6, stats2.getAverage(), DELTA);
		assertEquals(28, stats2.getMin());
		assertEquals(51, stats2.getMax());
	}

}
