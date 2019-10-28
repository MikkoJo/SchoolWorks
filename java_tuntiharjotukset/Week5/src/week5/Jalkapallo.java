package week5;

public class Jalkapallo extends Urheiluvaline implements Pallo {
	
	private int matka;
	
	public Jalkapallo() {
		super.setLaji("Jalkapallo");
		matka = 0;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void liiku(int m) {
		this.matka += m;
		System.out.println("Jalkapallo liikkui " + m + "m, kokonaismatka: " + this.matka + "m");
	}

	@Override
	public void nollaa() {
		this.matka = 0;

	}
	
	public String toString() {
		return "Jalkapallo";
	}

}
