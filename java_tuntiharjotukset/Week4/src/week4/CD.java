package week4;

public class CD {

		String artisti;
		String nimi;
		int pituus;
		int biiseja;

		public CD (String artisti, String nimi, int pituus, int biiseja) {
			this.artisti = artisti;
			this.nimi = nimi;
			this.pituus = pituus;
			this.biiseja = biiseja;
		}

		public CD (String artisti) {
			this.artisti = artisti;
			this.nimi = null;
			this.pituus = 0;
			this.biiseja = 0;
		}

		public CD () {
			this.artisti = null;
			this.nimi = null;
			this.pituus = 0;
			this.biiseja = 0;
		}
		
		public String toString() {
			return "Artisti: " + this.artisti + "\nLevyn nimi: " + this.nimi +
					"\nPituus; " + this.pituus + "\nBiisejä: " + this.biiseja + "\n";
			
		}
		
}

