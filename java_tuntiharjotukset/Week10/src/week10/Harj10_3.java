package week10;

class TestThrowException {
	private String test;
	
	public TestThrowException() {
		 test = null;
	}
	
	public String getText() {
		return test;
	}
	
}

public class Harj10_3 {

	public static void main(String[] args) {

		double[] test = new double[10];
		TestThrowException exp = new TestThrowException();
		TestThrowException exp2 = doSomething(exp);
		
		test[0] = 3.2;
		test[1] = 5.2;
		test[2] = 9.2;
		
		test[9] = 1.1;
		test[8] = 91.2;
		test[7] = 3.9;

		double sum = 0.0;
		System.out.println(test[5] + test[1]);
		try {
			System.out.println(exp2);
			String important = exp2.getText();
			System.out.println(important);
			
		} catch (NullPointerException e) {
			System.out.println("Nullpointer!!");
			e.printStackTrace();
		}
		
		try {
			for(double d: test) sum += d; 
			System.out.println("Prints fine " + sum);
			for(int i = 9; i > 4; i++) {
				System.out.println(test[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Something went wrong!!");
			e.printStackTrace();
		}
		
	}
		
	public static TestThrowException doSomething(TestThrowException exp) {
		return null;
	}
}
