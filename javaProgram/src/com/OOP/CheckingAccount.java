package com.OOP;

public class CheckingAccount extends Account{
	private double overdraftLimit;
	
	public CheckingAccount(Bank bank, Customer customer, int accountNumber, double balance, double overdraftLimit) {
		super(customer, accountNumber, balance);
		this.overdraftLimit = overdraftLimit;
	}
	
	public double getOverdraftLimit() {
		return overdraftLimit;
	}
	
	public void setOverdraftLimi(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}
	
	public void withdraw(double amount) {
		if (getBalance() > 500) {
			
		} else {
			System.out.println("Insufficient balance...");
		}
	}
}
