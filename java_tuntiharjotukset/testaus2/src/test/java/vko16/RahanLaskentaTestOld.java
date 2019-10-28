package vko16;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class RahanLaskentaTestOld {
	RahanLaskenta testattava;
	
    @Before
    public void setUp() throws Exception {
    	BigDecimal luku1 = new BigDecimal(123);
    	BigDecimal luku2 = new BigDecimal(234);
        // Ennen jokaista testiä suoritetava koodi
    	testattava = new RahanLaskenta(luku1, luku2, 1, 2, 3, "Raha dollareina: ",
    			"Raha euroina: ");
    }  
    @Test
    public void testSumma() {
    	assertEquals(357.00, testattava.getSumma().doubleValue(), 0.0000000001);
    }
    
    @Test
    public void testEro() {
    	assertEquals(111.00, testattava.getEro().doubleValue(), 0.0000000001);
    }
    
    @Test
    public void testKeskiarvo() {
    	assertEquals(178.5, testattava.getKeskiarvo().doubleValue(), 0.00000000000001);
    }
    
	@Test
	public void testGetProsentit() {
		BigDecimal lisaprosentti = new BigDecimal(12);
		assertEquals(14.76, testattava.getProsentit(lisaprosentti).floatValue(), 0.1);
    	BigDecimal luku1 = new BigDecimal(2340);
    	BigDecimal luku2 = new BigDecimal(3450);
		testattava = new RahanLaskenta(luku1, luku2, 1, 2, 3, "Raha dollareina: ", "Raha euroina: ");
		assertEquals(280.8, testattava.getProsentit(lisaprosentti).floatValue(), 0.1);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testGetVertailuArvo() {
    	BigDecimal luku1 = new BigDecimal(123);
    	BigDecimal luku2 = new BigDecimal(0);
		testattava = new RahanLaskenta(luku1, luku2, 1, 2, 3, "Raha dollareina: ", "Raha euroina: ");
		assertEquals(0.0, testattava.getVertailuArvo().floatValue(), 0.1);
	}
	
	@SuppressWarnings("unused")
	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testGetKertoimet() {
		int[] kertoimet = testattava.getKertoimet();
		int[] tarkistus = {1,2,3};
		assertArrayEquals(tarkistus, kertoimet);
		int kerroin = kertoimet[3];
	}	
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testGetTekstit1() {
		List<String> tarkistus = List.of("Raha dollareina: ", "Raha euroina: ");
		assertEquals(tarkistus, testattava.getTekstit());
		assertEquals("", testattava.getTekstit().get(3));
	}

	@Test(expected = NullPointerException.class)
	public void testGetTekstit2() {
		testattava.setTekstit(null);
		assertNull(testattava.getTekstit());
		testattava.getTekstit().add("Raha dollareina: ");
	}	
	
	/* JUnit 5 style
	@Test
	void shouldThrowException() {
	    Throwable exception = assertThrows(UnsupportedOperationException.class, () -> {
	      throw new UnsupportedOperationException("Not supported");
	    });
	    assertEquals(exception.getMessage(), "Not supported");
	}
	
	@Test
	void assertThrowsException() {
	    String str = null;
	    assertThrows(IllegalArgumentException.class, () -> {
	      Integer.valueOf(str);
	    });
	}
	*/

}
