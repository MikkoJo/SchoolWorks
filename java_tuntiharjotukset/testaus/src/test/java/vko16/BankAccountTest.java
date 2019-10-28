package vko16;

import static org.junit.Assert.*;

import java.text.NumberFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTest {
	
	BankAccount accountFrom;
	BankAccount accountTo;
    private static final double DELTA = 1e-15; // the maximum delta between expected and actual for which both values are still considered equal.
	
    @BeforeClass
    public static void setUpClass() throws Exception {
        // Ennen ensimmäistä testimetodia suoritettava koodi
    }
	
    @Before
    public void setUp() throws Exception {
        // Ennen jokaista testiä suoritetava koodi
		accountFrom = new BankAccount();
		accountFrom.setBalance(300000.00f);
		accountTo = new BankAccount();
		accountTo.setBalance(0f);

    }    
    
	@Test
	public void testWithdraw() {
		double balance = accountFrom.withdrawTo(accountTo, 0.05f);
		assertEquals(balance, accountFrom.getBalance(), DELTA);
		assertEquals(0.05f, accountTo.getBalance(), DELTA);
		assertEquals(299999.95d, accountFrom.getBalance(), DELTA);
		// Testataan jotain
	}

	@Test
	public void testMultipleWithdraw() {
	    int round;
	    // Add a dime to the principal a thousand times
	    for (round = 1; round <= 100000; round++)
	    {
	    	accountFrom.withdrawTo(accountTo, .10f);
	    }
	    
	}

	@After
    public void tearDown() throws Exception {
        // Jokaisen testin jälkeen suoritettava koodi
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
        // Viimeisen testin jälkeen suoritettava koodi
    }   
}
