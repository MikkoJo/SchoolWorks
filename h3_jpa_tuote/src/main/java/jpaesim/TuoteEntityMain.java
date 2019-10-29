package jpaesim;

import java.util.List;

import javax.persistence.*;

public class TuoteEntityMain {

	public static void main(String[] args) throws Exception {
		// Startataan H2 TCP-serverimoodissa
		org.h2.tools.Server server = org.h2.tools.Server.createTcpServer().start();

		EntityManagerFactory tehdas = Persistence.createEntityManagerFactory("jpa_tuote");
		EntityManager manageri = tehdas.createEntityManager();

		EntityTransaction transaktio = manageri.getTransaction();

		// Transaktion aloitus
		transaktio.begin();

		Tuote t1 = new Tuote();
		Tuote t2 = new Tuote();
		Tuote t3 = new Tuote();
		Tuote t4 = new Tuote();
		Tuote t5 = new Tuote();
		Tuote t6 = new Tuote();
		Tuote t7 = new Tuote();
		// TODO: tuote asetukset
		// TODO: Lisää useita tuotteita

		manageri.persist(t1);
		manageri.persist(t2);
		manageri.persist(t3);
		manageri.persist(t4);
		manageri.persist(t5);
		manageri.persist(t6);
		manageri.persist(t7);

		t1.setNimi("Pesäpallo");
		t1.setHinta(15.56);
		t1.setKoodi("A321");

		t2.setNimi("Jalkapallo");
		t2.setHinta(19.99);
		t2.setKoodi("A654");

		t3.setNimi("Koripallo");
		t3.setHinta(24.99);
		t3.setKoodi("B342");

		t4.setNimi("Lumipallo");
		t4.setHinta(0.01);
		t4.setKoodi("Q157");

		t5.setNimi("Tennispallo");
		t5.setHinta(.99);
		t5.setKoodi("C888");

		t6.setNimi("Golfpallo");
		t6.setHinta(5.87);
		t6.setKoodi("B674");

		t7.setNimi("Keilapallo");
		t7.setHinta(79.49);
		t7.setKoodi("C824");

		// Transaktion lopettaminen
		transaktio.commit();

		// Testihaku - haetaan ja tulostetaan kaikki kannassa olevat Tuote-entiteetit
		@SuppressWarnings("unchecked")
		List<Tuote> entiteetit = manageri.createQuery("SELECT t FROM Tuote t").getResultList();
		for (Tuote e : entiteetit) {
			System.out.println("Rivi: " + e.getId() + ", Hinta: " + e.getHinta());
		}
		// TODO: Tee haku namedQuery perustuen entiteettiluokkaan
		manageri.createNamedQuery("selectByName", Tuote.class)
				.setParameter("name", "%ip%")
				.getResultList()
				.forEach(System.out::println);
		
		manageri.close();
		tehdas.close();
		// Lopetetaan h2-palvelin
		server.stop();
	}

}
