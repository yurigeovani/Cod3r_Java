package com.ygtech.cod3r.exercisesAndTests.interfaces.ex04;

import java.util.ArrayList;
import java.util.List;

class Bank {
	
	private List<Accounts> accounts;

	public Bank() {
		accounts = new ArrayList<Accounts>();
	}
	
	public void addAccount(Accounts account) {
		accounts.add(account);
	}
	
	public void removeAccount(Accounts account) {
		accounts.remove(account);
	}
	
	public void deposit(Accounts account, double amount) {
		account.deposit(amount);
	}
	
	public void withdraw(Accounts account, double amount) {
		account.withdraw(amount);
	}
	
	public void viewAccountBalances() {
		for (Accounts account : accounts) {
			System.out.println("Account balance: " + account.viewBalances());
		}
	}

}
