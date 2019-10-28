package vko17;

import java.time.LocalDateTime;

public class PaasyLippu {
	private double hinta;
	private LocalDateTime alkamisAika;
	private LocalDateTime loppumisAika;
	
	public double getHinta() {
		return hinta;
	}
	
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
	public LocalDateTime getAlkamisAika() {
		return alkamisAika;
	}
	
	public void setAlkamisAika(LocalDateTime alkamisAika) {
		this.alkamisAika = alkamisAika;
	}
	
	public LocalDateTime getLoppumisAika() {
		return loppumisAika;
	}
	
	public void setLoppumisAika(LocalDateTime loppumisAika) {
		this.loppumisAika = loppumisAika;
	}
}
