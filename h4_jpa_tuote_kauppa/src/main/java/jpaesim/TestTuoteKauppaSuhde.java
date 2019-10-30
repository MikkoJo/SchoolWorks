package jpaesim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

public class TestTuoteKauppaSuhde {

	public static void main(String[] args) throws Exception {
		// Startataan H2 TCP-serverimoodissa
		org.h2.tools.Server server = org.h2.tools.Server.createTcpServer().start();

		EntityManagerFactory tehdas = Persistence.createEntityManagerFactory("jpa_tuote");
		EntityManager manageri = tehdas.createEntityManager();
		EntityTransaction transaktio = manageri.getTransaction();

		Tuote t1 = new Tuote();
		t1.setNimi("Pesäpallo");
		t1.setHinta(15.56);
		t1.setKoodi("A321");

		Tuote t2 = new Tuote();
		t2.setNimi("Jalkapallo");
		t2.setHinta(19.99);
		t2.setKoodi("A654");

		Tuote t3 = new Tuote();
		t3.setNimi("Koripallo");
		t3.setHinta(24.99);
		t3.setKoodi("B342");

		Kauppa k1 = new Kauppa();
		k1.setNimi("Palloliike");
		k1.setOsoite("Pallokuja 2, Helsinki");

		Kauppa k2 = new Kauppa();
		k2.setNimi("Välineaitta");
		k2.setOsoite("Kauppatie 45, Jyväskylä");

		Kauppa k3 = new Kauppa();
		k3.setNimi("Verkkosportti");
		k3.setOsoite("Kuplahallintie 15, Toijala");
		
		//TODO: Lisätään ensin kaupat listaan ja sitä kautta asetetaan tuotteelle kaupat
		List<Kauppa> kaupat = new ArrayList<>();
		kaupat.add(k1);
		kaupat.add(k2);
		t1.setKaupat(kaupat);

		t3.setKaupat(Arrays.asList(k2, k3));
		transaktio.begin();

		manageri.persist(t1);
		manageri.persist(t2);
		manageri.persist(t3);
		// TODO: tallennetaan sekä tuotteet että kaupat
		// Ei tarvii jos annotaatio @OneToMany(cascade = CascadeType.ALL) laitettu
//		manageri.persist(k1);
//		manageri.persist(k2);
//		manageri.persist(k3);

		transaktio.commit();

		List<Tuote> tuoteLista = manageri.createNamedQuery("selectAll", Tuote.class).getResultList();
		tuoteLista.forEach(t -> System.out.println(t.getNimi() +": " + t.getKaupat()));
		// TODO: Testihaku - haetaan ja tulostetaan kaikki kannassa olevat
		// Kauppa ja Tuote-entiteetit

		manageri.close();
		tehdas.close();
		System.out.println("Some testing");
		manageri = null;
		tehdas = null;
		tehdas = Persistence.createEntityManagerFactory("jpa_tuote");
		manageri = tehdas.createEntityManager();
		List<Tuote> tuoteLista2 = manageri.createNamedQuery("selectAll", Tuote.class).getResultList();
		
		for(Tuote t: tuoteLista2) {
			t.getKaupat().size();
		}
		tuoteLista2.forEach(t -> System.out.println(t.getNimi() +": " + t.getKaupat()));
		manageri.close();
		tehdas.close();
		// Lopetetaan h2-palvelin
		server.stop();
	}
}
