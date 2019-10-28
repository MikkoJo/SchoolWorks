package luokka4;

public class AutoTesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Auto toyota = new Auto();
		toyota.asetaNimi("Toyota");
		toyota.asetaMalli("Romu");
//		System.out.println(toyota.palautaNimi());
//		System.out.println(toyota.palautaMalli());
		toyota.tulosta();
		Auto peugeot = new Auto("Peugeot", "306");
		peugeot.asetaNimi("Peugeot");
//		peugeot.asetaMalli("Ranskan rapea");
//		System.out.println(peugeot.palautaNimi());
//		System.out.println(peugeot.palautaMalli());
		peugeot.tulosta();
	}

}
