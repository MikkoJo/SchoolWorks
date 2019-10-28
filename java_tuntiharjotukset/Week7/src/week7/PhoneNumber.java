package week7;

public class PhoneNumber {
	
	private String countryCode;
	private String number;
	private String type;
	
	public PhoneNumber() {}

	public PhoneNumber(String countryCode, String number, String type) {
		this.countryCode = countryCode;
		this.number = number;
		this.type = type;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type + ": +" + countryCode + " " + number.substring(1); 
	}
}
