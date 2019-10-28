package vko16;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {
	BankAccount accountFrom;
	BankAccount accountTo;
	
    @Before
    public void setUp() throws Exception {
        // Ennen jokaista testiä suoritetava koodi
    	accountFrom = new BankAccount();
    	accountFrom.setBalance(30000.0f);
    	accountTo = new BankAccount();
    	accountTo.setBalance(0f);
    }    
    
    @Test
    public void testWithdraw() {
    	accountFrom.withdrawTo(accountTo, 0.05d);
    	double summa = accountFrom.getBalance() + accountTo.getBalance();    	
    	assertEquals(30000, summa, 0.001);
    	assertEquals(29999.95, accountFrom.getBalance(), 0.001);
    	assertEquals(0.05, accountTo.getBalance(), 0.001);
    	summa = accountFrom.getBalance() + accountTo.getBalance();    	
    	assertEquals(30000, summa, 0.001);
    }
    
	@Test
	public void testMultipleWithdraw() {
		accountFrom.setBalance(12345678.9f);
		// Testataan peräkkäisiä nostoja
    	double summa = accountFrom.getBalance() + accountTo.getBalance();    	
    	assertEquals(12345678.9, summa, 1);

    	int round;
		for (round = 1; round <= 100000; round++) {
			accountFrom.withdrawTo(accountTo, .1);
		}
		
		assertEquals(12335678.9, accountFrom.getBalance(), 1);
		assertEquals(10000.0, accountTo.getBalance(), 0.001);
    	summa = accountFrom.getBalance() + accountTo.getBalance();    	
    	assertEquals(12345678.9, summa, 1);
	}	
}
