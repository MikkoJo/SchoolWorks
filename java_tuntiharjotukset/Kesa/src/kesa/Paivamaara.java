package kesa;

public class Paivamaara {
	
	private int year;
	private int month;
	private int day;

	public Paivamaara() {}

	public Paivamaara(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String suomiFormaatti() {
		return String.format("%02d", day) + "." + String.format("%02d", month) + 
				"." + String.format("%02d", year);
	}
	public String usaFormaatti() {
		return String.format("%02d", year) + "-" + String.format("%02d", month) + "-" +
				String.format("%02d", day) ;
	}
	public String isoFormaatti() {
		return String.format("%02d", month) + "/" + String.format("%02d", day)  +  
				"/" + String.format("%02d", year);
		
	}
	
	public String toString() {
		return suomiFormaatti();
	}
}
