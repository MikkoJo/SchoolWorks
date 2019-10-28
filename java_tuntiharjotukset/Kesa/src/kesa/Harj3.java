package kesa;

public class Harj3 {

	public static String muunnaHeksaluvuksi(int luku) {
		return Integer.toHexString(luku);
	}

	public static String muunnaBinaariluvuksi(int luku) {
		return Integer.toBinaryString(luku);
	}

	public static String muunnaOktaaliluvuksi(int luku) {
		return Integer.toOctalString(luku);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(muunnaHeksaluvuksi(11) + "," + muunnaHeksaluvuksi(257));
		 System.out.println(muunnaBinaariluvuksi(255) + "," + muunnaBinaariluvuksi(256));
		 System.out.println(muunnaOktaaliluvuksi(255) + "," + muunnaOktaaliluvuksi(256));

	}

}
