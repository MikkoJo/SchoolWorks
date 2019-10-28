
	/**
	 * @author Ismo Harjunmaa
	 *
	 */
	public class TahtiTulostus {

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			int riveja = 10;
			
			for (int i = riveja; i >= 0; i--) {
				for (int j = i; j >= 0; j--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			int keskikohta = riveja / 2;
			
			for (int i = 0; i < riveja; i++) {
				int tahtienLkm = 0;
				int valienLkm = 0;
				
				if (i < keskikohta) {
					tahtienLkm = 2 * i + 1;
					valienLkm = keskikohta - i;
				} else {
					tahtienLkm = riveja - (i - keskikohta) * 2 - 1;
					valienLkm = i - keskikohta;
				}
				
				System.out.println("Tähtiä: " + tahtienLkm + " välejä: " + valienLkm);
			}

		}

	}


