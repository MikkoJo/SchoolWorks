package week7;

public class Kysymys implements Vaikeustaso {

	private String kysymys;
	private String vastaus;
	private int vaikeusTaso;

	public Kysymys() {}
	
	public Kysymys(String kysymys, String vastaus) {
		this.kysymys = kysymys;
		this.vastaus = vastaus;
	}

	public Kysymys(String kysymys, String vastaus,int vaikeusTaso) {
		this.kysymys = kysymys;
		this.vastaus = vastaus;
		this.vaikeusTaso = vaikeusTaso;
	}

	public String getKysymys() {
		return kysymys;
	}

	public void setKysymys(String kysymys) {
		this.kysymys = kysymys;
	}

	public String getVastaus() {
		return vastaus;
	}

	public void setVastaus(String vastaus) {
		this.vastaus = vastaus;
	}

	public boolean tarkistaVastaus(String vastaus) {
		return this.vastaus == vastaus;
	}
	
	public int getTaso() {
		return vaikeusTaso;
	}

	public void setTaso(int vaikeusTaso) {
		this.vaikeusTaso = vaikeusTaso;
	}

	@Override
	public String toString() {
		return "kysymys: " + kysymys + "\nvastaus: " + vastaus + "\ntaso: " + vaikeusTaso;
	}
	
	
}