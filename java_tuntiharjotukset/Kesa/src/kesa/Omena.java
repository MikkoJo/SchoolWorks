package kesa;

public class Omena {
	private String nimi;
	private double paino;
	
	Omena() {}
	
	Omena(String nimi, double paino) {
		this.nimi = nimi;
		this.paino = paino;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public double getPaino() {
		return paino;
	}

	public void setPaino(double paino) {
		this.paino = paino;
	}

	@Override
	public String toString() {
		return "[" + nimi + ", " + paino + "]";
	}
	
	
}
