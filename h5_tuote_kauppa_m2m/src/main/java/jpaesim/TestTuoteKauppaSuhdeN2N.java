package jpaesim;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

public class TestTuoteKauppaSuhdeN2N {

	public static void main(String[] args) throws Exception {
		// Startataan H2 TCP-serverimoodissa
        org.h2.tools.Server server = org.h2.tools.Server.createTcpServer().start();

		EntityManagerFactory tehdas = Persistence.createEntityManagerFactory("jpa_tuote");
		EntityManager manageri = tehdas.createEntityManager();
		EntityTransaction transaktio = manageri.getTransaction();

		Tuote t1 = new Tuote();

		Kauppa k1 = new Kauppa();

		// TODO: Määritä muut kaupat ja tuotteet

		// Lisätään tuotteet listassa kaupalle
		List<Tuote> tuotteet = new ArrayList<Tuote>();
		tuotteet.add(t1);
		//kaupat.add(t2);

		k1.setTuotteet(tuotteet);
		
		// TODO: Lisätään muut kaupat
		// *******************

		transaktio.begin();

		manageri.persist(k1);
		manageri.persist(t1);
		// TODO: Muut tuotteet ja kaupat myös tallennettava
		
		transaktio.commit();
		

		// Testihaku - haetaan ja tulostetaan kaikki kannassa olevat
		// Language-entiteetit
	    //@SuppressWarnings("unchecked")
		//List<Tuote> entiteetit = manageri.createNamedQuery("selectTuotteet").getResultList();
		//for (Tuote e : entiteetit) {
		//	System.out.println("Rivi: " + e);
		//}

		List<Object[]> shops = manageri.createQuery("Select k, t from Kauppa k INNER JOIN k.tuotteet t", Object[].class).getResultList();
		for (Object[] row : shops) {
			  System.out.println(row[0] + " " +  row[1]);
			}
		

		manageri.close();
		tehdas.close();
        // Lopetetaan h2-palvelin
        server.stop();		

	}

}
