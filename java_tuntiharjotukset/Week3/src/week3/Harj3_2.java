package week3;

public class Harj3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[]  uc = new char[126];
		for (int i = 32; i <= 126; i++) {
			char  uco = (char)i;
			System.out.println(uco);
		}
		for (int i = 32; i <= 126; i++) {
			uc[i -32]  = (char)i;
		}
		for (int k = 0; k < uc.length; k++) {
			System.out.println(uc[k]);
		}
	}

}
