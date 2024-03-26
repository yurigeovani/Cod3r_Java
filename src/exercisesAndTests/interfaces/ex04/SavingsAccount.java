package exercisesAndTests.interfaces.ex04;

class SavingsAccount implements Accounts{

	private double amount;
	private double interestRate = 0.0125;
	
	@Override
	public void deposit(double money) {
		this.amount+=money;
	}

	@Override
	public void withdraw(double money) {
		this.amount-=money;
	}

	@Override
	public void calculateInterest() {
		this.amount+=this.amount*interestRate;
	}

	@Override
	public double viewBalances() {
		return this.amount;
	}

	public SavingsAccount(double amount) {
		super();
		this.amount = amount;
	}
}
