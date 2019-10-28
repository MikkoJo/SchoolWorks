package vko17;

import java.util.ArrayList;
import java.util.List;

public class Varaus {
	private ArrayList<PaasyLippu> liput;
	private int varausNro;
	
	public Varaus(int nro) {
		varausNro = nro;
		liput = new ArrayList<PaasyLippu>();
	}

	public int getVarausNro() {
		return varausNro;
	}

	public void setVarausNro(int varausNro) {
		this.varausNro = varausNro;
	}

	public ArrayList<PaasyLippu> getLiput() {
		return liput;
	}
	
	public void varaaLippu(PaasyLippu lippu) {
		
	}

	public List<PaasyLippu> varaaLippuja(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
