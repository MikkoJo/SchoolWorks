package week4;

public class Harj4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] firstTable = {1,2,3,4,5,6,7,8,9,10};
		int[] secondTable = {100,90,80,70,60,50,40,30,20,10};
		
		System.out.println("Before Change:");
		System.out.println("First:");
		printTable(firstTable);
		System.out.println("\nSecond:");
		printTable(secondTable);

		vaihdaTaulukot(firstTable, secondTable);
		System.out.println("After Change:");
		System.out.println("First:");
		printTable(firstTable);
		System.out.println("\nSecond:");
		printTable(secondTable);
	}


	public static boolean vaihdaTaulukot(int[] a, int[] b) {
	
		if (a.length != b.length) {
			return false;
		}

		int[] helper = new int[a.length];
		
		for (int i = 0; i < a.length; i++) {
			helper[i] = a[i];
			a[i] = b[i];
			b[i] = helper[i];
		}
		
		return true;
	}
	
	private static void printTable(int[] a) {
		
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + ", ");
		}
		System.out.println();

	}
}
