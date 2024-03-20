package exercisesAndTests.oo.inheritance.ex05;

class BankAccount {

	private String accountNumber;
	private double balance;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double deposit) {
		this.balance += deposit;
	}
	public void withdraw(double withdraw) {
		if(getBalance()<withdraw) {
			System.out.println("Insufficient balance!");
		} else {
			this.balance -= withdraw;			
		}
	}
	
	
}
