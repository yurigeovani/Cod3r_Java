package com.ygtech.cod3r.exercisesAndTests.oo.encapsulation.ex02;

class Ex02 {

	public static void main(String[] args) {

		/*2. Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
		 * Provide public getter and setter methods to access and modify these variables.*/
		
		
		BankAccount account1 = new BankAccount();
		
		account1.setAccountNumber(001);
		account1.setBalance(100.12);
		
		System.out.println(account1.getAccountNumber() + ": $ " + account1.getBalance());

		BankAccount account2 = new BankAccount();
		
		account2.setAccountNumber(002);
		account2.setBalance(200.21);
		
		System.out.println(account2.getAccountNumber() + ": $ " + account2.getBalance());
		
	}

}
