package kesa;

public class Pikseli extends Piste {

	private int color;

	public Pikseli() {
		super();
	}

	public Pikseli(int x, int y, int color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString() + ",\tColor: " + color;
	}
	
}
