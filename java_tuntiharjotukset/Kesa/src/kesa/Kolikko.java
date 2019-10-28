package kesa;

import java.util.Random;

public class Kolikko {

	private int state; // 0 kruuna, 1 klaava
	private Random randomizer; 
	
	public Kolikko() {
		randomizer = new Random();
		
	}
	
	
	public void heita() {
		state = randomizer.nextInt(2);
	}
	
	public int palautaArvo() {
		return state;
	}
}
