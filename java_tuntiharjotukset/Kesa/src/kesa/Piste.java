package kesa;

public class Piste implements Cloneable {
	private int xPos, yPos;
	private int ID;
	
	public Piste() {}

	public Piste(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}
	
	public Piste(String xy) {
		String[] temp = xy.split(",");
		this.xPos = Integer.parseInt(temp[0]);
		this.yPos = Integer.parseInt(temp[1]);
	}
	
	public void setPoint(int x, int y) {
		this.xPos = x;
		this.yPos = y;
	}

	@Override
	public String toString() {
		return "X: " + xPos + ",\tY: " + yPos;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
