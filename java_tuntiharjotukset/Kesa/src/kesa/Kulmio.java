package kesa;

public class Kulmio {
	private static final int KULMIA = 3;
	private Piste[] kulmat;
	
	public Kulmio() {
		kulmat = new Piste[KULMIA];
	}
	
	public Kulmio(Piste a, Piste b, Piste c) {
		kulmat = new Piste[KULMIA];
		kulmat[0] = a;
		kulmat[1] = b;
		kulmat[2] = c;
				
	}

	public Kulmio(String a, String b, String c) {
		kulmat = new Piste[KULMIA];
		kulmat[0] = new Piste(a);
		kulmat[1] = new Piste(b);
		kulmat[2] = new Piste(c);
				
	}
	
	// abc = "(3,4), (3,9), (5,6)"
//	public Kulmio(String abc) {
//		kulmat = new Piste[KULMIA];
//		String[] temp = abc.split()
//		kulmat[0] = new Piste(a);
//		kulmat[1] = new Piste(b);
//		kulmat[2] = new Piste(c);
//				
//	}
}
