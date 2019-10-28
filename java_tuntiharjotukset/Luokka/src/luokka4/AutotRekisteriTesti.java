package luokka4;

public class AutotRekisteriTesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto toyota = new Auto("Toyota", "Corolla");
		Auto peugeot = new Auto("Peugeot", "306");
		Auto honda = new Auto("Honda", "Civic");
		Auto vw = new Auto("Volkswagen", "Golf");

		AutoRekisteri rekisteri = new AutoRekisteri();
		rekisteri.lisaa(toyota);
		rekisteri.lisaa(peugeot);
		rekisteri.lisaa(honda);
		rekisteri.lisaa(vw);
		rekisteri.lisaa(new Auto("BMW", "635i"));
		rekisteri.tulosta();
		rekisteri.sortNimi();
		System.out.println("Sorttauksen jälkeen");
		System.out.println(rekisteri);
	}

}
