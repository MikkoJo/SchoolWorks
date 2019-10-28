package luokka4;

import java.util.ArrayList;
import java.util.Comparator;

public class AutoRekisteri {
	private ArrayList<Auto> autot = null;
	
	public AutoRekisteri() {
		this.autot = new ArrayList<>();
	}

	public void lisaa(Auto auto) {
		this.autot.add(auto);
	}

	public void tulosta() {
		for (Auto auto: autot) {
			System.out.println(auto);
		}
	}

	public String toString() {
		StringBuilder total = new StringBuilder();
		for (Auto auto: autot) {
			total.append(auto + "\n");
		}
		return total.toString();
	}
	
	public void sortNimi() {
		autot.sort(new AutoComparator());
	}
}

class AutoComparator implements Comparator<Auto> {
	public int compare(Auto auto1, Auto auto2) {
		return auto1.palautaNimi().compareTo(auto2.palautaNimi());
	}
}