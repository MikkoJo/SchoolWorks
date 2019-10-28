package kesa;

public class BensaTankki {
	
	double tilavuus;
	double bensanMaara;
	
	public BensaTankki(double tilavuus, double bensanMaara) {
		this.tilavuus = tilavuus;
		this.bensanMaara = bensanMaara;
	}
	
	@Override
	public String toString() {
		return "BensaTankin tilavuus on " + tilavuus + " litraa, ja siell� on " +
				bensanMaara + " litraa bensaa.";
	}
	

}
