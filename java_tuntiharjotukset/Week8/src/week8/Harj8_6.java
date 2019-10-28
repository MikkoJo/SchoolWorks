package week8;

import java.util.ArrayList;
import java.util.List;

public class Harj8_6 {
	
	public static void main(String[] args) {
		
		List<String> mjonoLista = new ArrayList<String>();
		List<String> poistetut = new ArrayList<String>();
		
		mjonoLista.add("A1");
		mjonoLista.add("B1");
		mjonoLista.add("C1");
		mjonoLista.add("D1");
		mjonoLista.add("E1");
		mjonoLista.add("C1");
		System.out.println(mjonoLista);
		System.out.println("_______________________________________");

		poistetut.add(mjonoLista.remove(mjonoLista.indexOf("A1")));
		poistetut.add(mjonoLista.remove(mjonoLista.indexOf("C1")));
		mjonoLista.remove("F1");

		System.out.println(mjonoLista);
		System.out.println(poistetut);
	}
}
