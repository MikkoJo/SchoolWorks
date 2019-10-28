package week5;

public class NisakasTesti {

	public static void main(String[] args) {
		
		Ihminen ihm1 = new Ihminen("Kalle", 122, 300, 22);
		Aikuinen aik1 = new Aikuinen("Pera", 154, 45, 44, "Toyota");
		Vauva vau1 = new Vauva("Masa", 54, 15, 1, "Pirkka");
		
		ihm1.liiku();
		ihm1.setIka(30);
		System.out.println("Ihminen ikä: " + ihm1.getIka() + " paino: " + ihm1.getPaino() +
							" pituus: " + ihm1.getPituus());
		ihm1.setPaino(200);
		ihm1.setPituus(159);
		ihm1.kasva();
		System.out.println("Ihminen ikä: " + ihm1.getIka() + " paino: " + ihm1.getPaino() +
				" pituus: " + ihm1.getPituus());
		System.out.println("Vauva ikä: " + vau1.getIka() + " paino: " + vau1.getPaino() +
				" pituus: " + vau1.getPituus());
		vau1.liiku();
		vau1.kasva();
		vau1.setPaino(18);
		vau1.setPituus(60);
		vau1.setVaippa("Pampers");
		System.out.println("Vauva ikä: " + vau1.getIka() + " paino: " + vau1.getPaino() +
				" pituus: " + vau1.getPituus() + " vaippa: " + vau1.getVaippa());
		
		System.out.println("Aikuisen ikä: " + aik1.getIka() + " paino: " + aik1.getPaino() +
				" pituus: " + aik1.getPituus() + " auto: " + aik1.getAuto());
		
		aik1.liiku();
		aik1.setAuto("Honda");
		aik1.setIka(99);
		aik1.setPaino(78);
		aik1.setPituus(199);
		aik1.kasva();
		
		System.out.println("Aikuisen ikä: " + aik1.getIka() + " paino: " + aik1.getPaino() +
				" pituus: " + aik1.getPituus() + " auto: " + aik1.getAuto());
		
		

	}

}
