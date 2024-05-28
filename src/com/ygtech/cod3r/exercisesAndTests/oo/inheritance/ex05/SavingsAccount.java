package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex05;

class SavingsAccount extends BankAccount{
	@Override
	public void withdraw(double withdraw) {
		if(getBalance() - withdraw >100) {
			super.withdraw(withdraw);			
		} else {
			System.out.println("Balance less than 100 dollars");
		}
	}
}
