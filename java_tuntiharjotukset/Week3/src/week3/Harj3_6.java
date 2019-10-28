/**
 * 
 */
package week3;

/**
 * @author mikko
 *
 */
public class Harj3_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] kortit = new int[13];
		String[] nimet = {"Ässä", "Kaksi", "Kolme", "Neljä", "Viisi", "Kuusi", "Seitsemän",
							"Kakdeksan", "Yhdeksän", "Kymmenen", "Jätkä", "Kuningatar", "Kuningas"};
		
		for (int i = 0; i < kortit.length;  i++) {
			kortit[i] = i+1;
		}
		
		for (int i = 0; i < kortit.length;  i++) {
			System.out.printf("%d:%s\n", kortit[i], nimet[i]);
		}
	}

}
