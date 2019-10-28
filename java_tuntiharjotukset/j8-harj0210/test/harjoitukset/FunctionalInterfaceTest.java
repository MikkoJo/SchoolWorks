package harjoitukset;
import static org.junit.Assert.assertEquals;
import java.util.function.*;
import org.junit.Test;

// Harjoitus 13-1 - mallivastaus

public class FunctionalInterfaceTest {
	@Test
    public void usingFunctionInterface() {
        Function<String, String> convertFunction = s -> s.toUpperCase(); // TODO
        String r3 = convertFunction.apply("Test");
        assertEquals(r3, (String)"TEST"); // testaa, onko arvot yhtäsuuret
        String r4 = convertFunction.apply("");
        assertEquals(r4, (String)""); // testaa, onko arvot yhtäsuuret
    }
	@Test
    public void usingSupplier() {
		//Supplier<Double> randomNumb = () -> Math.random(); // Tuloksena joku satunnaisluku väliltä 0.0-1.0
        Supplier<String> supplier = () -> "Supplier"; // TODO
        String r1 = supplier.get();
        assertEquals(r1, (String)"Supplier");        
    }
	@Test
    public void usingPredicate() {    
        Predicate<Integer> predicate = i -> i > 10; // TODO
        Boolean r1 = predicate.test(20); // Java 9: new Integer(20) ==> 20! Ei tarvitse Integer konstruktoria, vaan sitä kutsutaan automaattisesti
        Boolean r2 = predicate.test(5);
        assertEquals(r1, (Boolean)true);        
        assertEquals(r2, (Boolean)false);        
    }
	@Test
	public void usingConsumer() {
		Consumer<String> consumer = x -> System.out.println("From consumer:" + x.toUpperCase());
		consumer.accept("Consumer");
		// TODO: testing of consumer
		// Miten testataan? periaatteessa ei oikein mitenkään.... Pelkkää Tulostusta ei ole mielekästä testata
        // Lisäksi Consumer ei palauta yhtään mitään
	}


}
