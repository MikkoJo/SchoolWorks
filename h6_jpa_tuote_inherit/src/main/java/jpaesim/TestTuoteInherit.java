package jpaesim;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

public class TestTuoteInherit {

	public static void main(String[] args) throws Exception {
		// Startataan H2 TCP-serverimoodissa
		org.h2.tools.Server server = org.h2.tools.Server.createTcpServer().start();

		EntityManagerFactory tehdas = Persistence.createEntityManagerFactory("jpa_tuote");
		EntityManager manageri = tehdas.createEntityManager();
		EntityTransaction transaktio = manageri.getTransaction();

		Kirja k1 = new Kirja();
		k1.setIsbn("A123");
		k1.setNimi("Core Java");
		k1.setHinta(26.99); 
		k1.setTekijat("Cay Horstmann"); 

		Kirja k2 = new Kirja(); 
		k2.setIsbn("A223"); 
		k2.setNimi("JavaScript Ninja"); 
		k2.setTekijat("John Resig"); 
		k2.setHinta(33.50); 

		Kirja k3 = new Kirja(); 
		k3.setIsbn("A313"); 
		k3.setNimi("Thinking Of Java"); 
		k3.setTekijat("Bruce Eckel"); 
		k3.setHinta(9.95); 

		Cd cd1 = new Cd("Iron Maiden", "Powerslave", 3048, 8, 19.95); 
		Cd cd2 = new Cd("Tom Petty", "Full Moon Fever", 2398, 12, 14.95); 
		Cd cd3 = new Cd("Paula Koivuniemi", "Luotan Sydämen Ääneen", 2850, 12, 4.95); 
		Cd cd4 = new Cd("The Beatles", "Abbey Road", 2545, 17, 29.95); 
        
		transaktio.begin();

		manageri.persist(k1);
		manageri.persist(k2);
		manageri.persist(k3);
		manageri.persist(cd1);
		manageri.persist(cd2);
		manageri.persist(cd3);
		manageri.persist(cd4);
		// TODO: Muut tuotteet ja kaupat myös tallennettava
		
		transaktio.commit();
		System.out.println(k1);
		List<Kirja> kirjat = manageri
				.createQuery("SELECT b FROM Kirja b", Kirja.class)
				.getResultList();
		kirjat.forEach(System.out::println);

		List<Cd> cdt = manageri
				.createQuery("SELECT b FROM Cd b", Cd.class)
				.getResultList();
		cdt.forEach(System.out::println);

		System.out.println("\nC-kohta: Hinta 15€ tai yli\n");
		manageri.createNamedQuery("etsiKaalliitLevyt", Cd.class)
			.setParameter("rajahinta", 15).getResultList()
			.forEach(System.out::println);

		System.out.println("\nD-kohta: Hinta 15€ tai alle\n");
		manageri.createNamedQuery("etsiHalvat", Tuote.class)
			.setParameter("rajahinta", 15)
			.getResultList().forEach(System.out::println);
		System.out.println("Pelkät Cdt:");
		List<Tuote> tuotteet = manageri.createNamedQuery("etsiHalvat", Tuote.class)
		.setParameter("rajahinta", 15)
		.getResultList();
		tuotteet.stream()
			.filter(t -> t.getClass().getCanonicalName() == "jpaesim.Cd")
			.forEach(System.out::println);
//		tuotteet.forEach(t -> System.out.println(t.getClass().getCanonicalName()));
		
		manageri.close();
		tehdas.close();
        // Lopetetaan h2-palvelin
        server.stop();		

	}

}
