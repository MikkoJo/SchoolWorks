package vko16;

import static org.junit.Assert.*;

import vko16.BankAccount;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BankAccountTestOld {
	BankAccount accountFrom;
	BankAccount accountTo;
    private static final double DELTA = 1e-15; // the maximum delta between expected and actual for which both values are still considered equal.

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
		accountFrom.withdrawTo(accountTo, 0.05d);
		assertEquals(accountFrom.getBalance(), 299999.95f, DELTA);
	}

	@Test
	public void testMultipleWithdraw() {
		int round;
	    for (round = 1; round <= 100000; round++)
	    {
	    	accountFrom.withdrawTo(accountTo, .10f);
	    }
	    assertEquals(accountFrom.getBalance(), 290000.00f, DELTA);
	}
	 
}
