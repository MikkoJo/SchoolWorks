package week10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Harjoitus 4_5
public class RekisteriTesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "files/henkilot.dat";
		FileInputStream file;
		ObjectInputStream in;
		FileOutputStream outFile;
		ObjectOutputStream out;
		
		Henkilo h1 = new Henkilo("Matti", "Meikalainen","111131-123L");
		Henkilo h2 = new Henkilo("Teija", "Teikaläinen","220242-234U");
		Henkilo h3 = new Henkilo("Pekko", "Peloton",    "330313A3451");
		Henkilo h4 = new Henkilo("Ulla", "Untamoinen",  "010175-543R");
		Henkilo h5 = new Henkilo("Aku", "Avainheimo",   "020286+4320");
		Henkilo h6 = new Henkilo("Simo", "Avainheimo",  "030486-654Y");

        Rekisteri rekisteri = new Rekisteri();
        Rekisteri luettuRekisteri = null;
        rekisteri.lisaaHenkilo(h1);
        rekisteri.lisaaHenkilo(h2);
        rekisteri.lisaaHenkilo(h3);
        rekisteri.lisaaHenkilo(h4);
        rekisteri.lisaaHenkilo(h5);
        rekisteri.lisaaHenkilo(h6);
        
        int henkiloMaara = rekisteri.palautaHenkilomaara();
        
        for (int i = 0; i < henkiloMaara; i++) {
        	System.out.println(rekisteri.palautaHenkilo(i).palautaTiedot());
        }
        
        System.out.println("Serializing rekisteri");
        try {
        	outFile = new FileOutputStream(fileName);
        	out = new ObjectOutputStream(outFile);
        	out.writeObject(rekisteri);
        	out.close();
        	outFile.close();
        	
        } catch (IOException ex) { 
            System.out.println(ex); 
        } 
        System.out.println("Deserializing rekisteri");
        try {
        	file = new FileInputStream(fileName);
        	in = new ObjectInputStream(file);
        	luettuRekisteri = (Rekisteri)in.readObject();
        	
        } catch (IOException ex) { 
            System.out.println(ex); 
        } catch (ClassNotFoundException e) {
            System.out.println(e); 
		} 
        System.out.println("*".repeat(60));
        henkiloMaara = rekisteri.palautaHenkilomaara();
        
        for (int i = 0; i < henkiloMaara; i++) {
        	System.out.println(luettuRekisteri.palautaHenkilo(i).palautaTiedot());
        }
	}

}
