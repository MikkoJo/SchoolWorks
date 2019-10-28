package vko16;

import java.text.NumberFormat;

public class BankAccountProgram {
	public static void main(String[] args)
	{
	    // Mistä rahaa siirretään
		BankAccount accountFrom = new BankAccount();
		accountFrom.setBalance(300000.00f);
		BankAccount accountTo = new BankAccount();
		accountTo.setBalance(0f);
		
		accountFrom.withdrawTo(accountTo, 0.05d);
		
		System.out.println("Tilillä 1 on " + accountFrom.getBalance());
		System.out.println("Tilillä 2 on " + accountTo.getBalance());

		accountFrom.deposit(12045678.9d);

		// monta vähennystä tehdään
	    int round;
	    NumberFormat fmt = NumberFormat.getCurrencyInstance();

		System.out.println("Tilillä 1 on ennen " + fmt.format(accountFrom.getBalance()));
		System.out.println("Tilillä 2 on ennen " + fmt.format(accountTo.getBalance()));
	    	    
	    // Add a dime to the principal a thousand times
	    for (round = 1; round <= 100000; round++)
	    {
	    	accountFrom.withdrawTo(accountTo, .10f);
	    }

		System.out.println("Tilillä 1 on ennen " + fmt.format(accountFrom.getBalance()));
		System.out.println("Tilillä 2 on ennen " + fmt.format(accountTo.getBalance()));
		
	}
}
