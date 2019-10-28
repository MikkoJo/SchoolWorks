package week3;

public class Harj3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kassa = 0;
//		int[] luvut = new int[3];
		double[] luvut = new double[3];
		boolean voitto = false, kaksi = false;

		for (int j = 0; j < 4; j++) {
			kassa += 1;
			for (int i = 0; i < luvut.length; i++) {
				luvut[i] = (int)(Math.random() * 100) + 1;
//				luvut[i] = Math.random()/Math.nextDown(1.0);
//				luvut[i] = 1 * (1.0 - luvut[i]) + 2 *  luvut[i];
//				luvut[i] = (int) Math.round(luvut[i]);
			}
//			System.out.println(luvut[0] == luvut[1] && luvut[0] == luvut[2]);
			if ( luvut[0] == luvut[1] && luvut[0] == luvut[2]) {
				if ( luvut[1] == luvut[2]) {
					System.out.println("SUURI VOITTO!");
					kassa -= 100;
				}
			}
			System.out.printf("Kassaa jäljellä: %d\n", kassa);
		}
		
	}

}
