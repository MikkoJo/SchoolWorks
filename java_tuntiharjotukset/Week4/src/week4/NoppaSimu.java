package week4;

public class NoppaSimu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int THROWS = 6000;
		final int LENGTH = 100;
		Noppa dice = new Noppa();
		int[] totals = new int[6];
		int number = 0;
		
		for (int i = 0; i < THROWS; i++) {
			number = dice.heita();
			totals[number - 1]++;
		}
		
		for (int j = 0; j <= 100; j += 10) {
			if (j < 100) {
				System.out.printf(j + "%8s", " ");
			}
			else {
				System.out.println(j + "%");
			}
		}

		for (int j = 0; j <= 100; j += 10) {
			System.out.printf("|%9s", " ");
			if (j == 100) {
				System.out.println();
			}
			
		}
		for (int j = 0; j <= LENGTH; j++) {
			System.out.print("-");
		}
		System.out.println();

		for (int j = 0; j < totals.length; j++) {
			long percent = Math.round((double)totals[j] / THROWS * 100);
			System.out.print((j + 1) + ": ");
			if (percent > 0) {
				for (int k = 0; k < percent; k++) {
					System.out.print("*");
				}
			}
			System.out.println("\t" + percent);
		}
	}

}
