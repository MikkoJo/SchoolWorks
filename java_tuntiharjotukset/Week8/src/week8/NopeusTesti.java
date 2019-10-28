package week8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeSet;

@SuppressWarnings("unused")
public class NopeusTesti {

    public static void main(String args[]){

       

        final int MAX_HENKILOITA_LISAYS = 100000;

        final int MAX_HENKILOITA_ETSINTA = 10000;

       

        // Valitaan millä tietorakenteella esimerkkiä testataan!

        ArrayList<Henkilo> henkilot = new ArrayList<Henkilo>();
//        lisaysaika  (ms) = 188
//        hakuaika (ms) = 14695

//        LinkedList<Henkilo> henkilot = new LinkedList<Henkilo>();
//        lisaysaika  (ms) = 186
//        hakuaika (ms) = 18080
        
        //TreeSet<Henkilo> henkilot = new TreeSet<Henkilo>();
//        lisaysaika  (ms) = 340
//   		hakuaika (ms) = 29377
//        HashSet<Henkilo>  henkilot = new HashSet<Henkilo>();
//        lisaysaika  (ms) = 265
//  		hakuaika (ms) = 53795

       

        long alkuAika = System.currentTimeMillis();

        for(int i=0; i<MAX_HENKILOITA_LISAYS; i++){

           String etunimi = luoSatunnainenMerkkijono(4);

           String sukunimi = luoSatunnainenMerkkijono(8);

           String sotu = luoSatunnainenMerkkijono(8);

           Henkilo h = new Henkilo(etunimi,sukunimi,sotu,50);

           henkilot.add(h);

        }

        long loppuAika = System.currentTimeMillis();

        System.out.println("lisaysaika  (ms) = " + (loppuAika - alkuAika) );

 

        alkuAika = System.currentTimeMillis();

        for(int i=0; i<MAX_HENKILOITA_ETSINTA; i++) {

            String etunimi = luoSatunnainenMerkkijono(4);

            for (Henkilo h : henkilot) {

                if (etunimi.equals(h.getEtunimi())) {

                    //System.out.println("Loydetty henkilo :" + h);

                    break;

                }

            }

        }

        loppuAika = System.currentTimeMillis();

        System.out.println("hakuaika (ms) = " + (loppuAika-alkuAika));        

    }

   

    // Luo satunnaisen merkkijonon, jonka pituus on maksimissaan määrä merkkiä ja joka voi sisältää merkit 65-90

    private static String luoSatunnainenMerkkijono(int maara){

        StringBuilder jono = new StringBuilder();

        Random rand = new Random();

        for(int i=0; i<maara; i++)

            jono.append(String.valueOf(((char)(rand.nextInt(25) + 65)))); //65-90 eli A-Z

        return jono.toString();

    }

}

 