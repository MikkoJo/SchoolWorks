package java8Tunti;

@FunctionalInterface
interface Calculator {
	int calculate(int num);
}

@FunctionalInterface
interface Calculator2 {
	int calculate(int num1, int num2);
}

// Miten tekisit seuraavat laskuoperaatiot Lambda-lausekkeilla
// a) f(num) = num * 10
// b) f(num) = num * num * num
// c) f(num1, num2) = num1 * num2
// d) f(num1, num2) = num1 * num 2* Math.PI
public class J8CalculateDemo {

	public static void main(String[] args) {
		// Käytä Calculator-interfacea
		Calculator multiply10 = (n) -> n * 10;
		Calculator pow3 = (n) -> n * n * n;
		Calculator2 multiply = (n1, n2) -> n1 * n2;
		Calculator2 multiplyWithPI = (n1, n2) -> (int)(n1 * n2 * Math.PI);
		Calculator2 multiplyWithPIRound = (n1, n2) -> (int)Math.round(n1 * n2 * Math.PI);
		
		
		System.out.println(multiply10.calculate(15));
		System.out.println(pow3.calculate(5));
		System.out.println(multiply.calculate(15, 22));
		System.out.println(multiplyWithPI.calculate(10, 10));
		System.out.println(multiplyWithPIRound.calculate(10, 10));
	}

}
