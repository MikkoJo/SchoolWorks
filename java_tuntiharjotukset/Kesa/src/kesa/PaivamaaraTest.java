package kesa;

public class PaivamaaraTest {
	public static void main(String[] args) {
		Paivamaara pvm = new Paivamaara(17, 6, 2019);
		System.out.println(pvm);
		pvm.setDay(pvm.getDay() +  1);
		System.out.println(pvm.usaFormaatti());
		pvm.setMonth(pvm.getMonth() +  1);
		System.out.println(pvm.isoFormaatti());

	}

}
