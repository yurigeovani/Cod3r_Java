package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex05;

class SavingsAccount extends BankAccount {
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double amount) {
		super(amount);
	}

	@Override
	public void withdraw(double amount) {
		if(amount<0) {
			System.out.println("Invalid amount!");
		} else if(getBalance()-amount<100) {
			System.out.println("Balance less than 100 dollars!");
		} else {
			this.balance-=amount;
		}
	}
}
