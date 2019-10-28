package week8;

public interface KalalistaInterface {
	java.util.ArrayList<Kala> get();  // palauttaa kalalistan
    void lisaa(Kala kala); // lisää uuden kalan
    void lisaa(String laji, String kalastaja, int paino, int pituus);      
    void poista(int indeksi); // poistaa kalan paikasta
    void jarjesta();        // Järjestäminen painon mukaan
    
}
