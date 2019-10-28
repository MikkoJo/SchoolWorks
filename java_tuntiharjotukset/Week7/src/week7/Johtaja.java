package week7;

public class Johtaja extends Tyontekija {
	private String auto;
	private double bonus;
	
	public Johtaja() {
		super();
	}
	
	public Johtaja(String nimi, String asema, double palkka, String auto, double bonus) {
		super(nimi, asema, palkka);
		this.auto = auto;
		this.bonus = bonus;
	}
	
	public String getAuto() {
		return auto;
	}
	public void setAuto(String auto) {
		this.auto = auto;
	}
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Autoetu: " + auto + " Bonus: " + bonus;
	}
	
}
