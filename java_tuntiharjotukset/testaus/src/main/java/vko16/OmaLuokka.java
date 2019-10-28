package vko16;

public class OmaLuokka {
	private String nimi;

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getFirstName(String token) {
		int index = nimi.indexOf(token);
		return nimi.substring(0, index);
	}
}
