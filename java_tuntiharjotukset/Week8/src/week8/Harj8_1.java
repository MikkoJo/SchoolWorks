package week8;

import java.util.HashSet;

public class Harj8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Henkilo h1 = new Henkilo("Matti", "Meikalainen","111131-123A", 84);
		Henkilo h2 = new Henkilo("Teija", "Teikaläinen","220242-234B", 73);
		Henkilo h3 = new Henkilo("Pekko", "Peloton",    "050363-345A", 52);
		Henkilo h4 = new Henkilo("Ulla", "Untamoinen",  "010175-543B", 40);
		Henkilo h5 = new Henkilo("Aku", "Avainheimo",   "020286-432C", 29);
		Henkilo h6 = new Henkilo("Aku", "Avainheimo",   "020286-432C", 29);

		HashSet<Henkilo> henkilot = new HashSet<Henkilo>();
		
		henkilot.add(h1);
		henkilot.add(h2);
		henkilot.add(h3);
		henkilot.add(h4);
		henkilot.add(h5);
		henkilot.add(h6);
		henkilot.add(new Henkilo("Aku", "Avainheimo",   "020286-432C", 29));
		System.out.println(henkilot);

		henkilot.add(h3);
		henkilot.add(h4);
		henkilot.add(h5);
		
		System.out.println(henkilot);

	}

}
