package week7;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.text.DateFormatter;

public class KalenteriTapahtuma {
	Calendar kalenteri;
	String aktiviteetti;
	public KalenteriTapahtuma() {
		kalenteri = new GregorianCalendar();
	}
	
	public KalenteriTapahtuma(Calendar kalenteri, String aktiviteetti) {
		this.kalenteri = kalenteri;
		this.aktiviteetti = aktiviteetti;
	}
	//17, 6, 2015, 9, "Koulutus")
	public KalenteriTapahtuma(int dayOfMonth, int month, int year, int hourOfDay, String aktiviteetti) {
		this.aktiviteetti = aktiviteetti;
		kalenteri = new GregorianCalendar(year, month, dayOfMonth, hourOfDay, 0);
	}

	public Calendar getKalenteri() {
		return kalenteri;
	}

	public void setKalenteri(Calendar kalenteri) {
		this.kalenteri = kalenteri;
	}

	public String getAktiviteetti() {
		return aktiviteetti;
	}

	public void setAktiviteetti(String aktiviteetti) {
		this.aktiviteetti = aktiviteetti;
	}
	
	public boolean tarkistaAika(int dayOfMonth, int month, int year, int hourOfDay) {
		if(hourOfDay < 0 && hourOfDay > 23) return false;
		try {
			LocalDate.of(year, month, dayOfMonth);
		}
		catch (Exception DateTimeException) {
			return false;
		}
		return true;
	}
	private String formatDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy  HH:mm");
		sdf.setCalendar(kalenteri);
		return sdf.format(kalenteri.getTime());
	}
	@Override
	public String toString() {
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy:H");
		return formatDate() + ":\t" + aktiviteetti;
	}
	
	
}
