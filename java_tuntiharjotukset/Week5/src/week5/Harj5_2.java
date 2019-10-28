package week5;

public class Harj5_2 {

	public static void main(String[] args) {

		Pallo[] pallot = new Pallo[8];
		
		pallot[0] = new Jalkapallo();
		pallot[1] = new Pesapallo();
		pallot[0] = new Jalkapallo();
		pallot[1] = new Pesapallo();
		pallot[0] = new Jalkapallo();
		pallot[1] = new Pesapallo();
		pallot[0] = new Jalkapallo();
		pallot[1] = new Pesapallo();
		pallot[0] = new Jalkapallo();
		pallot[1] = new Pesapallo();
		
		System.out.println(pallot[0].getClass());
		System.out.println(pallot[1].getClass());
		pallot[0].liiku(90);
		System.out.println(pallot[1]);
		System.out.println(pallot[0]);
		
		Urheiluvaline urh = (Urheiluvaline) new Jalkapallo();
		System.out.println(urh.getClass());
		Object obj = new Jalkapallo();
		System.out.println(obj.getClass());
		//System.out.println(.getLaji());
	}

}
