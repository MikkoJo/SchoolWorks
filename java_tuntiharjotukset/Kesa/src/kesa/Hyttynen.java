package kesa;

public class Hyttynen {
	
	private boolean alive = false;
	
	public void synny() {
		this.alive = true;
		System.out.println("Hyttynen syntyy");
	}
	
	public void lenna() {
		if(alive) {
			System.out.println("Hyttynen lent��");
		}
	}
	
	public void ime(String meal) {
		if(alive) {
			System.out.println("Hyttynen imee " + meal);
		}
	}
	
	public void kuole() {
		this.alive = false;
		System.out.println("Hyttynen kuolee");
	}


}
