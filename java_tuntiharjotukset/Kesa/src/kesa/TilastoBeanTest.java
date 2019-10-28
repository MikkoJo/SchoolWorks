package kesa;

public class TilastoBeanTest {
	public static void main(String[] args) {
		TilastoBean sb = new TilastoBean();
		sb.setLukuMerkkijono("600, 470, 170, 430, 300");
//		sb.setLukuMerkkijono("400,500,600,700,800,900,1000,1100,1200");
		System.out.println(sb.getLuku(0));
		System.out.println(sb.getLuku(1));
		System.out.println(sb.getLuku(2));
		System.out.println(sb.getKoko());

		System.out.println("summa=" + sb.getSumma());
		System.out.println("keskiarvo=" + sb.getKeskiarvo());
		System.out.println("Minimi=" + sb.getMin());
		System.out.println("Maximi=" + sb.getMax());
		System.out.println("Varianssi=" + sb.getVarianssi());
		System.out.println("Keskihajonta=" + sb.getKeskihajonta());
		
		System.out.println(sb);
		System.out.println("J�rjestyksess�;\n" + sb.tulostaJarjestyksessa());
	}

}
