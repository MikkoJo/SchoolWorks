package basic.basic2functional;

//import java.util.function.*; // Näistä yleensä löytyy tarvittavat Java 8:n mukanaan tuomat funktionaaliset luokat
//import java.util.stream.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class CalculateFunctionsFunctionalDemo {
	// static final variables to define LOWER and UPPER limits
	static final int LOWER = 1, UPPER = 10;

	public static void main(String argv[]) {

// Yksittäinen tulostaminen suhteellisen suoraviivaista ja nopeaa
		IntStream.rangeClosed(LOWER, UPPER).forEach(x -> System.out.print(x + " "));
		System.out.println();
		IntStream.range(LOWER, UPPER + 1).forEach(y -> System.out.print(y + " "));
		System.out.println();
		
		// Kuinka yhdistetään nämä kaksi erillistä forEach-iteraatiota,
		// jotta saadaan kertotaulu laskettua?
		IntStream.rangeClosed(LOWER, UPPER).forEach(x -> {
			IntStream.range(LOWER, UPPER + 1).forEach(y -> System.out.print(x * y + "\t"));
			System.out.println();
		});

		long summa = LongStream.rangeClosed(LOWER, UPPER).parallel().sum();
		double keskiarvo = LongStream.rangeClosed(LOWER, UPPER).average().getAsDouble();
		System.out.println(summa + " - " + keskiarvo);

	}
}
