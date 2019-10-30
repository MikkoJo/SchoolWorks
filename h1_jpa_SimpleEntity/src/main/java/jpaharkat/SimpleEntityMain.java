package jpaharkat;

import javax.persistence.*;
import java.util.*;

/*
 Harjoituksissa voi käyttää pohjana esimerkkejä, joita löytyy osoitteesta:
 
 http://www.objectdb.com/java/jpa/query/execute
 
 1. Lisätään JPA-luokkaan SimpleEntity uusi ominaisuus.
 
 String desc;
  
  Muuta ohjelmaa siten, että saat tallennettua tiedot tietokantaan.

2. Haku - haetaan ja tulostetaan kaikki kannassa olevat SimpleEntity-entiteetit
Käytetään metodia createNamedQuery("selectAll")

3. Haku 

Haetaan ja tulostetaan kaikki kannassa olevat kirjaimella K alkavat entiteetit.
Tehdään haku käyttäen TypedQuery -luokkaa

		TypedQuery<String> kysely = manageri.createQuery("kysely", TulosLuokkasi.class);
		List<String> tulokset = kysely.getResultList();


4. Haku 
haetaan ja tulostetaan kaikki kannassa olevat kirjaimen A sisältävät entiteetit


5. Haku - Käytätään parametrisoitua kyselyä, jossa kyselylle voidaan antaa parametri

kysely.setParameter("name", "%l%").getResultList();

		
6. Poista kaikki ne, jotka sisältävät ä-kirjaimen ja  poista myös ne rivit, jotka sisältävät l-kirjaimen.
Tee ensin kysely.

*/

public class SimpleEntityMain {
	public static void main(String[] args) throws Exception {
		 // Startataan H2 TCP-serverimoodissa
         org.h2.tools.Server server = org.h2.tools.Server.createTcpServer().start();


		EntityManagerFactory tehdas = Persistence
				.createEntityManagerFactory("jpa_SimpleEntity_harjoitus");
		EntityManager manageri = tehdas.createEntityManager();

		EntityTransaction transaktio = manageri.getTransaction();

		transaktio.begin();

		SimpleEntity p1 = new SimpleEntity();
		SimpleEntity p2 = new SimpleEntity();
		SimpleEntity p3 = new SimpleEntity();
		SimpleEntity p4 = new SimpleEntity();
		SimpleEntity p5 = new SimpleEntity();
		SimpleEntity p6 = new SimpleEntity();
		// TODO: aseta tuotteelle ominaisuudet
		p1.setName("Pallo"); 
		p2.setName("Kello"); 
		p3.setName("Auto"); 
		p4.setName("kAla"); 
		p5.setName("äiti"); 
		p6.setName("Kone"); 

		p1.setDesc("Punainen");
		p2.setDesc("Rolex");
		p3.setDesc("lada");
		p4.setDesc("Hauki"); 
		p5.setDesc("Kiva"); 
		p6.setDesc("Hiiri"); 

		manageri.persist(p1);
		manageri.persist(p2);
		manageri.persist(p3);
		manageri.persist(p4);
		manageri.persist(p5);
		manageri.persist(p6);

		transaktio.commit();

		// TODO: Tähän väliin harjoitukset		
		// TODO: Myös harjoituksen kaksi voi tehdä samaan tiedostoon
		@SuppressWarnings("unchecked")
		List<SimpleEntity> results = manageri.createNamedQuery("selectAll").getResultList();
		results.forEach(l -> System.out.println("Name: " + l.getName() + ", Description: " + l.getDesc()));

		System.out.println("K-kirjaimella alkavat:");
		TypedQuery<String> kysely = manageri
				.createQuery("SELECT ent.name FROM SimpleEntity ent WHERE upper(ent.name) LIKE 'K%'", String.class);
		List<String> tulokset = kysely.getResultList();
		tulokset.forEach(System.out::println);

		System.out.println("Sisältää A-kirjaimen:");
		TypedQuery<String> kyselyA = manageri
				.createQuery("SELECT ent.name FROM SimpleEntity ent WHERE upper(ent.name) LIKE '%A%'", String.class);
		List<String> tuloksetA = kyselyA.getResultList();
		tuloksetA.forEach(System.out::println);

		System.out.println("Sisältää A-kirjaimen koko entity:");
		TypedQuery<SimpleEntity> kyselyAe = manageri
				.createQuery("SELECT ent FROM SimpleEntity ent WHERE upper(ent.name) LIKE '%A%'", SimpleEntity.class);
		List<SimpleEntity> tuloksetAe = kyselyAe.getResultList();
		tuloksetAe.forEach(System.out::println);

		System.out.println("Parametrikysely, sisältää l-kirjaimen:");
		Query kyselyP = manageri.createNamedQuery("nameParam");
		@SuppressWarnings("unchecked")
		List<SimpleEntity> tuloksetP = kyselyP.setParameter("name", "%l%").getResultList();
		tuloksetP.forEach(l -> System.out.println("Name: " + l.getName() + ", Description: " + l.getDesc()));

		System.out.println("Remove some lines:");
		Query kyselyR = manageri.createNamedQuery("findFromLine");
		@SuppressWarnings("unchecked")
		List<SimpleEntity> tuloksetR = kyselyR
			.setParameter("kirj1", "%ä%")
			.setParameter("kirj2", "%l%")
			.getResultList();
//		tuloksetR.forEach(l -> System.out.println("Name: " + l.getName() + ", Description: " + l.getDesc()));
		transaktio.begin();
			tuloksetR.forEach(e -> manageri.remove(e));
		transaktio.commit();
		
		System.out.println("After remove");
		@SuppressWarnings("unchecked")
		List<SimpleEntity> resultsD = manageri.createNamedQuery("selectAll").getResultList();
		resultsD.forEach(l -> System.out.println("Name: " + l.getName() + ", Description: " + l.getDesc()));
		
		manageri.close();
		tehdas.close();

        // Lopetetaan h2-palvelin
        server.stop();

	}
}