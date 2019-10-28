package week7;

abstract class Elain {
	
	private int ika;
	private String sukupuoli;
	private int paino;
	
	public Elain() {}
	
	
	public Elain(int ika, String sukupuoli, int paino) {
		this.ika = ika;
		this.sukupuoli = sukupuoli;
		this.paino = paino;
	}


	public void asetaIka(int ika) {
		this.ika = ika;
	}
	
	public void asetaSukupuoli(String sp) {
		this.sukupuoli = sp;
	}
	
	public void asetaPaino(int paino) {
		this.paino = paino;
	}
}
