package week8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Harj8_3 {
	
	public static void main(String[] args) {
		Henkilo h1 = new Henkilo("Matti", "Meikalainen","111131-123A", 84);
		Henkilo h2 = new Henkilo("Teija", "Teikaläinen","220242-234B", 73);
		Henkilo h3 = new Henkilo("Pekko", "Peloton",    "050363-345A", 52);
		Henkilo h4 = new Henkilo("Ulla", "Untamoinen",  "010175-543B", 40);
		Henkilo h5 = new Henkilo("Aku", "Avainheimo",   "020286-432C", 29);

		Map<Integer, Henkilo> henkilot = new HashMap<>();
		List<Henkilo> hTest = new ArrayList<>();
		
		henkilot.put(1564454, h1);
		henkilot.put(98881212, h2);
		henkilot.put(25997411, h3);
		henkilot.put(48721383, h4);
		henkilot.put(3555, h5);
//		h5.hashCode();
		
		System.out.println(henkilot);
		System.out.println(henkilot.get(25997411));
		henkilot.put(1, h3);
//		henkilot.put(h4);
//		henkilot.put(h5);
		
		System.out.println(henkilot);
		for(Map.Entry<Integer, Henkilo> e: henkilot.entrySet()) {
			hTest.add(e.getValue());
		}
		hTest.sort(null);
		System.out.println(hTest);
			
				
	}

}
