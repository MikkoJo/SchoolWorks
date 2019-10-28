package java8Tunti;

//Funktionaalisessa rajapinnassa saa olla vain yksi metodi
@FunctionalInterface
interface Printer {
	void print(String str); //Vain yksi abstrakti metodi
	
}

public class J8OwnFunctionalInterface {

	public static void main(String[] args) {
		Printer oldPr = new Printer() {
			private int i = 21;
			@Override
			public void print(String s) {
				System.out.println("Anonymous inner class: " + s + " " + i);
			}
		};
		
		String str = "Test";
		Printer pr = (s) -> System.out.println(s); //lambda
		Printer pr2 = (s) -> System.out.println("Rivikirjoitin: " + s); //lambda

		oldPr.print("Old style");
		pr.print(str);
		pr2.print("Test2");
		
	}

}
