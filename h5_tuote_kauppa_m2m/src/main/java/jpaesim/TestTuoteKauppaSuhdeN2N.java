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

        List<Tuote> tuotteet2 = new ArrayList<>();
        tuotteet2.add(t1);
        tuotteet2.add(t3);
        List<Tuote> tuotteet1 = new ArrayList<>();
        tuotteet1.add(t1);
        List<Tuote> tuotteet3 = new ArrayList<>();
        tuotteet3.add(t3);
        
        k1.setTuotteet(tuotteet1);
        k2.setTuotteet(tuotteet2);
        k3.setTuotteet(tuotteet3);
		// TODO: Määritä muut kaupat ja tuotteet

		//kaupat.add(t2);

		
		// TODO: Lisätään muut kaupat
		// *******************

		transaktio.begin();

		manageri.persist(k1);
		manageri.persist(k2);
		manageri.persist(k3);
		manageri.persist(t1);
		manageri.persist(t2);
		manageri.persist(t3);
//		manageri.persist(t1);
		// TODO: Muut tuotteet ja kaupat myös tallennettava
		
		transaktio.commit();
		

		// Testihaku - haetaan ja tulostetaan kaikki kannassa olevat
		// Tuote-entiteetit
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
