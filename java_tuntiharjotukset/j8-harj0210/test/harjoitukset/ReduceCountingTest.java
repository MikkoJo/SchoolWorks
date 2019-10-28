package harjoitukset;

import static org.junit.Assert.assertEquals;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
	

// Harjoitus 13-2 - mallivastaus
import org.junit.Test;

// Harjoitus 13-2 mallivastaus - tehtiin tunnilla 26.09.2019 osittain
// Lopussa on monia ratkaisuja, joita ei kysytty tehtävässä.

public class ReduceCountingTest {

final static List<Integer> numbers = List.of(5, 10, 15, 20, 11, 16, 21, 26, 25, 3);
	@Test
	public void collectEvenNumbers() {
		List<Integer> evenNumbers = numbers.stream()
				.filter(n -> n % 2 == 0)  // jaollinen kahdella....
				.collect(Collectors.toList());
		assertEquals(4, evenNumbers.size());
		System.out.println(evenNumbers);
	}
	@Test
	public void collectOddNumbers() {
		List<Integer> oddNumbers = numbers.stream()
				.filter(n -> n % 2 != 0)  // pariton
				.collect(Collectors.toList());
		assertEquals(6, oddNumbers.size());
		System.out.println(oddNumbers);
	}
	// c) Järjestä (sort) taulukko. 
	@Test
	public void sortNumbers() {
		List<Integer> sortNumbers = numbers.stream()
				.sorted()  // järjestä luonnolliseen järjestykseen (natural order)
				.collect(Collectors.toList());
		assertEquals((Integer)3, sortNumbers.get(0)); // Palauttaa listan ensimmäisen alkion
		System.out.println(sortNumbers);
	}	
	// d) Kerro jokainen luku itsellään ja palauta tulostaulukko
	@Test
	public void multNumbers() {
		List<Integer> multNumbers = numbers.stream()
				.map(n -> n*n)  // kuvaa map():llä
				.collect(Collectors.toList());
		assertEquals((Integer)25, multNumbers.get(0)); 
		System.out.println(multNumbers);
	}

    // e) summa	
	@Test
	public void countSum() {
		Integer result = numbers.stream()
              .reduce((a, b) -> a + b).get();
		assertEquals((Integer)152, result);
	}

    // f) kokonaislukulista merkkijonoksi reduce()-metodilla
	@Test
	public void createStringOfNumbers() {
		
		String str = numbers.stream()
              .map(x -> x.toString())
              .reduce("Luvut:", (res, i) -> res + "," + i);
		System.out.println(str);
		assertEquals((Integer)34, (Integer)str.length());
	}
	
	// Extra, edellinen Collertors.joining()-metodilla
	@Test
	public void createStringOfNumbersv2() {
		
		String str = numbers.stream()
              .map(x -> x.toString())
              .collect(Collectors.joining(","));
		System.out.println("Joining: " +  str);
		assertEquals("5,10,15,20,11,16,21,26,25,3", str);
	}

    // extra, summa valmiilla Collectors-metodilla Collectors.summingInt().
	@Test
	public void sumIntList() {
		int sum = numbers.stream()
				.collect(Collectors.summingInt(n -> n));
		assertEquals((Integer)152, (Integer)sum );
	}

    // extra, keskiarvo valmiilla Collectors-metodilla Collectors.averagingInt().
	@Test
	public void avgIntList() {
		double avg = numbers.stream()
				.collect(Collectors.averagingInt(n -> n));
		assertEquals((Double)15.2, (Double)avg );
		System.out.println("Keskiarvo oli: " + avg);
	}	
	
    // extra, Maksimiarvo sekä minimiarvo kokonaislukulistasta 
	// Arvot saadaan valmiilla Collectors-metodilla Collectors.maxBy() sekä minBy().
	@Test
	public void maxAndMinInList() {
		int max = numbers.stream()
				.collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		assertEquals((Integer)26, (Integer)max );
		Optional<Integer> min = numbers.stream()
				.collect(Collectors.minBy(Comparator.naturalOrder()));		
		assertEquals((Integer)3, (Integer)min.orElseGet(()->Integer.MIN_VALUE) );
		System.out.println("Minimi: " + min.get() + ", ja maksimi: " + max);

	}
		
}
