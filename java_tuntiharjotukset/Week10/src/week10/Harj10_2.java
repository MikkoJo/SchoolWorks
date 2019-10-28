package week10;

public class Harj10_2 {

	public static void main(String[] args) {
		
		try {
			int i = 5 / 0;
			System.out.println(i);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by ZERO! " + e);
			try {
				throw new NumberFormatException("Kivaa heitellä exceptioneita");
			} catch (NumberFormatException ex) {
				System.out.println(ex);
			}
		}
		
	}
}
