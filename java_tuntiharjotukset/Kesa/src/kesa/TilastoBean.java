package kesa;

import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Locale;

public class TilastoBean {
	private double[] luvut;
	//private static int KOKO = 9;
	private static NumberFormat form = NumberFormat.getInstance(new Locale("en", "US"));
	public TilastoBean() {
		//luvut = new double[KOKO];
	}
	
	public boolean setLukuMerkkijono(String luvut) {
		String[] temp = luvut.split(",");
		this.luvut = new double[temp.length];
		for(int i = 0; i < temp.length; i++) {
			try {
				this.luvut[i] = Double.valueOf(temp[i]);
			}
			
			catch(Exception NumberFormatException ) {
				return false;
			}
		}
		return true;
	}
	
	public double getLuku(int index) {
		return luvut[index];
	}
	
	public int getKoko() {
		return luvut.length;
	}
	
	public double getSumma() {
		double summa = 0;
		
		for(double d: luvut) {
			summa += d;
		}
		return summa;
	}
	
	public double getKeskiarvo() {
		return getSumma() / luvut.length;
	}
	
	public double getMin() {
		Double min = null;
		for(double d: luvut) {
			if(min == null) {
				min = d;
			}
			else {
				if(d < min) {
					min = d;
				}
			}
				
		}
		return min;
	}
	
	public double getMax() {
		Double max = null;
		for(double d: luvut) {
			if(max == null) {
				max = d;
			}
			else {
				if(d > max) {
					max = d;
				}
			}
				
		}
		return max;
	}
	
	public String tulostaJarjestyksessa() {
		double[] temp = this.luvut;
		Arrays.sort(temp);
		return Arrays.toString(temp);
	}
	
	public double getVarianssi() {
		double summa = 0;
		double ka = getKeskiarvo();
		
		for(double d: luvut) {
			summa += Math.pow((d - ka), 2);
		}
		
		return summa / luvut.length;
	}
	
	public double getKeskihajonta() {
		return Double.valueOf(form.format(Math.sqrt(getVarianssi())));
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < luvut.length; i++) {
			sb.append((i > 0 ? "," + luvut[i] : luvut[i]));
		}
		return sb.toString();
		
	}
}
