package week7h;

public class AikaTauluTest {

	public static void main(String[] args) {

		Aika t1 = new Aika();
		t1.setTunnit(10);
		t1.setMinuutit(34);

		Aika t2 = new Aika(13,25);
		Aika t3 = new Aika(15,24);
		Aika t4 = new Aika(18,46);
		Aika t5 = new Aika(22,54);
		
		AikaTaulu tt1 = new AikaTaulu();
		
		tt1.lisaaAika(t1);
		tt1.lisaaAika(t2);
		tt1.lisaaAika(t3);
		tt1.lisaaAika(t4);
		tt1.lisaaAika(t5);
		
		System.out.println("Aikataulu:");
		System.out.println(tt1);
	}

}
