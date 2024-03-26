package exercisesAndTests.interfaces.ex04;

class CurrentAccount implements Accounts{

	private double amount;
	private double overdraftLimit;
	private double interestRate = 0.02;
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	public void setOverdraftLimit(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	@Override
	public void deposit(double money) {
		this.amount+=money;
	}

	@Override
	public void withdraw(double money) {
		if(this.amount+getOverdraftLimit() >= money) {
			this.amount-=money;			
		} else {
			System.out.println("Insufficient balance!");
		}
	}

	@Override
	public void calculateInterest() {
		this.amount+=this.amount*interestRate;
	}

	@Override
	public double viewBalances() {
		return this.amount;
	}

	public CurrentAccount(double amount) {
		super();
		this.amount = amount;
	}
}