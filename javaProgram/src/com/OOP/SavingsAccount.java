package com.OOP;

public class SavingsAccount extends Account{
	private double minimumBalance;
	private double interestRate;
	
	public SavingsAccount(Bank bank, int accountNumber, double balance, double minimumBalance, double interestRate) {
		this.bank = bank;
		super.accountNumber = accountNumber;
		this.minimumBalance = balance;
		this.minimumBalance = minimumBalance;
		this.interestRate = interestRate;
	}
	
	double getMinimumBalance() {
		return minimumBalance;
	}
	
	void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	double getInterestRate() {
		return interestRate;
	}
	
	void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	double calculateInterest() {
		
	}
}
