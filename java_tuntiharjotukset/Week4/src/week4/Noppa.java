package week4;

import java.util.Random;

public class Noppa {

	private int arvo;
	
	public int heita() {
		Random rand = new Random();
		this.arvo = rand.nextInt(6) + 1;
		return arvo;
	}
	
	public void setArvo(int arvo) {
		this.arvo = arvo;
	}
	
	public int getArvo() {
		return arvo;
	}
}
