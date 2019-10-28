package harjoitukset;

import static org.junit.Assert.assertEquals;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import org.junit.Test;

public class FunctionalInterface {
	@Test
    public void usingFunctionInterface() {
        Function<String, String> convertFunction = s -> s.toUpperCase();
        String r3 = convertFunction.apply("Test");
        assertEquals(r3, (String)"TEST");

    }

	@Test
    public void usingSupplier() {

        Supplier<String> supplier = () -> "Supplier";// TODO: Set String supplier
        String r1 = supplier.get();
        assertEquals(r1, (String)"Supplier");        

    }

	@Test
	public void usingConsumer() {

		Consumer<String> consumer = 
				x -> System.out.println("From consumer:" + x.toUpperCase());
		consumer.accept("Consumer");
		// TODO: testing of consumer

	}

	@Test

    public void usingPredicate() {    

        Predicate<Integer> predicate = i -> i > 10;// TODO: Write predicate to test if number is greater than 10
        Boolean r1 = predicate.test(20);
        Boolean r2 = predicate.test(5);

        assertEquals(r1, (Boolean)true);        
        assertEquals(r2, (Boolean)false);        

    }
}
