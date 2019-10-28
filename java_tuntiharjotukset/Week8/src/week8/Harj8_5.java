package week8;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Harj8_5 {
	public static void main(String[] args) {

		Henkilo h1 = new Henkilo("Matti", "Meikalainen", "111131-123A", 84);
		Henkilo h2 = new Henkilo("Teija", "Teikaläinen", "220242-234B", 73);
		Henkilo h3 = new Henkilo("Pekko", "Peloton", "050363-345A", 52);
		Henkilo h4 = new Henkilo("Ulla", "Ontamoinen", "010175-543B", 40);
		Henkilo h5 = new Henkilo("Aku", "Avainheimo", "020286-432C", 29);

		List<Henkilo> henkilot = new LinkedList<Henkilo>();

		henkilot.add(h1);
		henkilot.add(h2);
		henkilot.add(h3);
		henkilot.add(h4);
		henkilot.add(h5);

		System.out.println(henkilot);

		henkilot.add(h3);
		henkilot.add(h4);
		henkilot.add(h5);

		ListIterator<Henkilo> iter = henkilot.listIterator(henkilot.size());
		// iter.
		while (iter.hasPrevious()) {
			System.out.println(iter.previous());
		}

		// Sortataan iän mukaan
		System.out.println("***Järjestys iän mukaan***");
//		LinkedList<Henkilo> henkilot2 = (LinkedList<Henkilo>) henkilot.clone()
		Collections.sort(henkilot, new IkaComparator());

		for (Henkilo henkilo : henkilot) {
			System.out.println(henkilo);
		}

		// Sortataan etunimen mukaan

		System.out.println("***Järjestys Etunimen mukaan***");
		Collections.sort(henkilot, new EtunimiComparator());
		for (Henkilo henkilo : henkilot) {
			System.out.println(henkilo);

		}
	}

}

class IkaComparator implements Comparator<Henkilo> {

	@Override
	public int compare(Henkilo o1, Henkilo o2) {
		// TODO Auto-generated method stub
		return o2.getAge() - o1.getAge();
	}

}

class EtunimiComparator implements Comparator<Henkilo> {

	@Override
	public int compare(Henkilo o1, Henkilo o2) {
		// TODO Auto-generated method stub
		return o1.getEtunimi().compareTo(o2.getEtunimi());
	}

}
