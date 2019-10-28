package vko16;

import static org.junit.Assert.*;

import vko16.BankAccount;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BankAccountTest {
	BankAccount accountFrom;
	BankAccount accountTo;
	
    @Before
    public void setUp() throws Exception {
        // Ennen jokaista testiä suoritetava koodi
    	accountFrom = new BankAccount();
		accountFrom.setBalance(300000.00f);
		accountTo = new BankAccount();
		accountTo.setBalance(0f);
    }    
    
    @Ignore
    @Test
    public void testWithdraw() {
    	accountFrom.withdrawTo(accountTo, 0.05d);
    	assertEquals(299999.95, accountFrom.getBalance(), 0.01);
    	assertEquals(0.05, accountTo.getBalance(), 0.01);
    }
    
    @Ignore
	@Test
	public void testMultipleWithdraw() {
		accountFrom.setBalance(12345678.9f);
		// Testataan peräkkäisiä nostoja
		int round;
		for (round = 1; round <= 10; round++) {
			accountFrom.withdrawTo(accountTo, .1);
			System.out.println(accountFrom.getBalance());
			System.out.println(accountTo.getBalance());
		}
		
		assertEquals(12345678.9, accountFrom.getBalance(), 1);
		assertEquals(10000.0, accountTo.getBalance(), 0.001);
	}	
	 
}
