package kesa;

public class LuokanOppilas {

	private String nimi;
	private boolean istuu;
	private static int count = 0;
	
	public LuokanOppilas() {
		count++;
	}
	
	public LuokanOppilas(String nimi, boolean istuu) {
		this.nimi = nimi;
		this.istuu = istuu;
		count++;
	}
	
	public void setIstuu(boolean istuu) {
		this.istuu = istuu;
	}
	
	public void tulosta() {
		System.out.println(this.toString());
	}
	
	public static int oppilaitaYhteensa() {
		return count;
	}
	
	@Override
	public String toString() {
		return nimi + (istuu ? " istuu." : " ei istu.");
//		if(istuu) {
//			return nimi + " istuu.";
//			
//		}
//		return nimi + " ei istu.";
	}
}
