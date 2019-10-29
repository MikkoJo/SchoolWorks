package jpaesim;

import java.util.ArrayList;
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

		Kauppa k1 = new Kauppa();

		//TODO: Lisätään ensin kaupat listaan ja sitä kautta asetetaan tuotteelle kaupat
		//List<Kauppa> kaupat = new ArrayList<Kauppa>();
		//kaupat.add(k1);
		//kaupat.add(k2);
		//t1.setKaupat(kaupat);

		transaktio.begin();

		manageri.persist(t1);
		// TODO: tallennetaan sekä tuotteet että kaupat
		manageri.persist(k1);

		transaktio.commit();

		// TODO: Testihaku - haetaan ja tulostetaan kaikki kannassa olevat
		// Kauppa ja Tuote-entiteetit

		manageri.close();
		tehdas.close();
		// Lopetetaan h2-palvelin
		server.stop();
	}
}
