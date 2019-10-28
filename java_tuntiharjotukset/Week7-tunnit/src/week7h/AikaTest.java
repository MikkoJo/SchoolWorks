package week7h;

public class AikaTest {

	public static void main(String[] args) {
		
		Aika time = new Aika();
		time.setTunnit(10);
		time.setMinuutit(34);
		
		System.out.println("tunnit: " + time.getTunnit());
		System.out.println("minuutit: " + time.getMinuutit());
		
		System.out.println(time.toString());
		System.out.println("Lisätään minutteja");
		
		time.lisaaMinuutit(43);
		System.out.println(time.toString());

		time.lisaaMinuutit(-18);
		System.out.println(time.toString());
	}

}
