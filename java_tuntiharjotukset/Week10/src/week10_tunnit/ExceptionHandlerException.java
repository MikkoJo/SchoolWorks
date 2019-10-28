package week10_tunnit;

import java.util.Arrays;

public class ExceptionHandlerException {
	
	public static void main(String[] args) {
		String[] mJonot = new String[5];
		mJonot[0] = "Kissa";
		mJonot[1] = null;
		mJonot[2] = null;
		mJonot[4] = "Koira";
		mJonot[3] += "Kettu";
		mJonot[2] += null;
		
		System.out.println(Arrays.toString(mJonot));
		System.out.println(mJonot[3]);
		
		try {
			mJonot[5] = null;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Havaittiin poikkeus: " + e);
		}
		
		System.out.println(mJonot);
		try {
			mJonot[1].length();
		} catch (NullPointerException e) {
			System.out.println("Havaittiin null poikkeus: " + e);
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} finally {
			System.out.println("Ajetaan aina");
		}
		
	}
}
