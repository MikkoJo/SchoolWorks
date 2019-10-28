package week2;
import java.util.Scanner;

public class Harj2_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Anna luku väliltä 1-9: ");
		int number = in.nextInt();
		switch (number) {
		case 1:
			System.out.println("Yksi");
			break;
		case 2:
			System.out.println("Kaksi");
			break;
		case 3:
			System.out.println("Kolme");
			break;
		case 4:
			System.out.println("Neljä");
			break;
		case 5:
			System.out.println("Viisi");
			break;
		case 6:
			System.out.println("Kuusi");
			break;
		case 7:
			System.out.println("Seitsemän");
			break;
		case 8:
			System.out.println("Kahdeksan");
			break;
		case 9:
			System.out.println("Yhdeksän");
			break;
			
		}

	}

}
