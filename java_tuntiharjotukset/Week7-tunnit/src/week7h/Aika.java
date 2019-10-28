package week7h;

public class Aika {
	private int hours;
	private int minutes;
	
	public Aika() {}
	
	

	public Aika(int hours, int minutes) {
		super();
		this.hours = hours;
		this.minutes = minutes;
	}

	public void setTunnit(int hours) {
		this.hours = hours;
	}
	
	public void setMinuutit(int minutes) {
		this.minutes = minutes;
	}
	
	public int getTunnit() {
		return this.hours;
	}
	
	public int getMinuutit() {
		return this.minutes;
	}
	
	public String toString() {
		return this.hours + ":" + this.minutes;
	}
	
	public void lisaaMinuutit(int minutes) {
		// uudet minuutit
		int minuutit = (this.hours * 60) + this.minutes + minutes;
		this.minutes = minuutit % 60;
		// uudet tunnit
		this.hours = (minuutit / 60 );
	}
	
}

