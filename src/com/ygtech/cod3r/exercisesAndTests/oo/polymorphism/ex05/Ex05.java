package com.ygtech.cod3r.exercisesAndTests.oo.polymorphism.ex05;

class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
		 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.
		 */
		
		BankAccount a1 = new BankAccount();
		a1.deposit(100);
		System.out.println("$ " + a1.getBalance());
		a1.withdraw(20);
		System.out.println("$ " + a1.getBalance());
		a1.withdraw(-100);
		System.out.println("$ " + a1.getBalance());
		
		SavingsAccount a2 = new SavingsAccount(80);
		a2.deposit(5);
		System.out.println("$ " + a2.getBalance());
		a2.withdraw(5);
		System.out.println("$ " + a2.getBalance());
	}
}
