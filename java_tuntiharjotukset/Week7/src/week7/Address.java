package week7;

public class Address {

	private String streetAddress;
	private String zipCode;
	private String city;
	private String type;

	public Address() {}
	
	public Address(String streetAddress, String zipCode, String city, String type) {
		this.streetAddress = streetAddress;
		this.zipCode = zipCode;
		this.city = city;
		this.type = type;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return streetAddress + "\n" + zipCode + " " + city;
	}

}
