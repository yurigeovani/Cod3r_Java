package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex05;

class BankAccount {
	double balance;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if(amount<0) {
			System.out.println("Invalid amount!");
		} else {
			this.balance+=amount;
		}
	}
	
	public BankAccount(double amount) {
		deposit(amount);
	}

	public BankAccount() {
		super();
	}

	public void withdraw(double amount) {
		if(amount<0) {
			System.out.println("Invalid amount!");
		} else if(getBalance()-amount<0) {
			System.out.println("Insufficient balance!");
		} else {
			this.balance-=amount;
		}
	}
}
