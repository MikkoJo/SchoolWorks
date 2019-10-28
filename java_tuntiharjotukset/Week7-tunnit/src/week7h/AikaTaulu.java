package week7h;

//import java.util.Arrays;

public class AikaTaulu {
	private Aika[] times = new Aika[5];
	private int index;

	public AikaTaulu() {
		index = 0;
	}
	
	public void lisaaAika(Aika time) {
		if(index < times.length) {
			times[this.index] = time;
			this.index++;
		}
	}

	@Override
	public String toString() {
		StringBuilder allTimes = new StringBuilder();
		for(int i = 0; i < this.index; i++) {
			allTimes.append(times[i]  + "\n");
		}
		return allTimes.toString();
	}
	
}
