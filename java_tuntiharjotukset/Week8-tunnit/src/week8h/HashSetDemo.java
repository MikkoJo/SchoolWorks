package week8h;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		HashSet<String> joukko = new HashSet<String>();
		
		joukko.add("Yksi");
		joukko.add("Kolme");
		joukko.add("Kaksi");
		joukko.add("Neljä");
		joukko.add("Viisi");
		joukko.add("Kuusi");
		joukko.add("Kuusi");
		joukko.add("Kuusi");
		joukko.add("Yksi");
		
		System.out.println(joukko);
		
		Set<String> uudet = new HashSet<>(Arrays.asList("two", "four", "1"));
		joukko.addAll(uudet);
		
		System.out.println(joukko);
		
		Set<String> poistettavat = new HashSet<>();
		poistettavat.add("Kuusi");
		poistettavat.add("1");
		joukko.removeAll(poistettavat);
		
		System.out.println(joukko);
	}

}
