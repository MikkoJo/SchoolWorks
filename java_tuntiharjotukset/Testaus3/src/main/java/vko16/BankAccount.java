package vko16;

public class BankAccount {
	private float balance;
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public double withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
		}
		return balance;
	}

	public double withdrawTo(BankAccount account, double amount) {
		if (amount <= balance) {
			balance -= amount;
			account.balance += amount;
		}
		return balance;
	}	
	
	public double deposit(double amount) {
		balance += amount;
		
		return balance;
	}

}
