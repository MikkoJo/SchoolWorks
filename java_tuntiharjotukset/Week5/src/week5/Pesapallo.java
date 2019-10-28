package week5;

public class Pesapallo extends Urheiluvaline implements Pallo {
	
	private int matka;

	public Pesapallo() {
		super.setLaji("Pesäpallo");
		matka = 0;
	}

	@Override
	public void liiku(int m) {
		this.matka += m;
		System.out.println("Pesäpallo lensi " + m + "m, kokonaismatka: " + this.matka + "m");
	}

	@Override
	public void nollaa() {
		matka = 0;
	}

	public String toString() {
		return "Pesäpallo";
	}

}
