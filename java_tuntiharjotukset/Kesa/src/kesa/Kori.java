package kesa;

import java.util.Arrays;

public class Kori {
	private String malli;
	private Omena[] omenat;
	private int index;

	private static int KOKO = 6; // korin maksimi koko

	public Kori() {
		this.omenat = new Omena[KOKO];
		this.index = 0;
	}
	
	public Kori(String malli) {
		this.malli = malli;
		omenat = new Omena[KOKO];
		this.index = 0;
	}
	
	private double laskePaino() {
		int paino = 0;
		for(Omena o: omenat) {
			paino += o.getPaino();
		}
		return paino;
	}
	
	public void lisaaOmena(Omena o) {
		if(index < KOKO) {
			omenat[index] = o;
			index++;
		}
		
	}
	@Override
	public String toString() {
		return "Kori [" + malli + " omenien yhteispaino: " + laskePaino() + "g.\n" +
				"Korissa omenat=" + Arrays.toString(omenat) + "]";
	}
	
}
