package java8;

public class FunctionalInterface {
	@Test
    public void usingFunctionInterface() {
        Function<String, String> convertFunction = // TODO: Convert uppercase
        String r3 = convertFunction.apply("Test");
        assertEquals(r3, (String)"TEST");

    }

	@Test
    public void usingSupplier() {

        Supplier<String> supplier = // TODO: Set String supplier
        String r1 = supplier.get();
        assertEquals(r1, (String)"Supplier");        

    }

	@Test
	public void usingConsumer() {

		Consumer<String> consumer = x -> System.out.println("From consumer:" + x.toUpperCase());
		consumer.accept("Consumer");
		// TODO: testing of consumer

	}

	@Test

    public void usingPredicate() {    

        Predicate<Integer> predicate = // TODO: Write predicate to test if number is greater than 10
        Boolean r1 = predicate.test(new Integer(20));
        Boolean r2 = predicate.test(new Integer(5 ));

        assertEquals(r1, (Boolean)true);        
        assertEquals(r2, (Boolean)false);        

    }
}
