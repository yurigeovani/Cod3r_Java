package com.ygtech.cod3r.exercisesAndTests.oo.inheritance.ex05;

class Ex05 {

	public static void main(String[] args) {

		/*
		 * 5. Write a Java program to create a class known as "BankAccount" with methods called deposit() and withdraw(). 
		 * Create a subclass called SavingsAccount that overrides the withdraw() method to prevent withdrawals if the account balance falls below one hundred.*/
		
		
        System.out.println("Create a Bank Account object (A/c No. BA1234) with initial balance of $500:");
		//Create a BankAccount object (A/c No. "BA1234") with initial balance of $500
        BankAccount BA1234 = new BankAccount();
        BA1234.setAccountNumber("BA1234");
        BA1234.setBalance(500);

        // Deposit $1000 into account BA1234
		System.out.println("Deposit $1000 into account BA1234:");
        BA1234.deposit(1000);
        System.out.println("New balance after depositing $1000: $" + BA1234.getBalance());

        // Withdraw $600 from account BA1234
		System.out.println("Withdraw $600 from account BA1234:");
        BA1234.withdraw(600);
        System.out.println("New balance after withdrawing $600: $" + BA1234.getBalance());

        // Create a SavingsAccount object (A/c No. "SA1234") with initial balance of $450
		System.out.println("\nCreate a SavingsAccount object (A/c No. SA1234) with initial balance of $450:");
        SavingsAccount SA1234 = new SavingsAccount();
        SA1234.setAccountNumber("SA1234");
        SA1234.setBalance(450);

        // Withdraw $300 from SA1234
        SA1234.withdraw(300);
        System.out.println("Balance after trying to withdraw $300: $" + SA1234.getBalance());

     
		// Create a SavingsAccount object (A/c No. "SA1000") with initial balance of $300
		System.out.println("\nCreate a SavingsAccount object (A/c No. SA1000) with initial balance of $300:");
        SavingsAccount SA1000 = new SavingsAccount();
        SA1000.setAccountNumber("SA1000");
        SA1000.setBalance(800);

        
        // Withdraw $250 from SA1000 (balance falls below $100)
		System.out.println("Try to withdraw $250 from SA1000!");
        SA1000.withdraw(250);
        System.out.println("Balance after trying to withdraw $250: $" + SA1000.getBalance());      		

	}
}
