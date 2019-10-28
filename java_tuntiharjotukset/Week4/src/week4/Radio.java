package week4;

public class Radio {
		
		private boolean power;
		private int volume;
		private double frequency;
		
		public Radio () {
			this.power = false;
			this.volume = 0;
			this.frequency = 2000;
		}
		
		public void asetaRadionTila(boolean power) {
			this.power = power;
		}
		
		public boolean asetaAanenVoimakkuus(int volume) {
			
			if (volume < 0 || volume > 9) {
				return false;
			}
			else {
				this.volume = volume;
				return true;
			}
		}
		
		public boolean asetaTaajuus(double freq) {
			
			if (freq < 2000 || freq > 26000) {
				return false;
			}
			else {
				this.frequency = freq;
				return true;
			}
		}
		
		public int mikaVoimakkuus() {
			return this.volume;
		}
		
		public double mikaTaajuus() {
			return this.frequency;
		}
		
		public boolean onkoPaalla() {
			return this.power;
		}
		
}

