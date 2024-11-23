package com.OOP;

// The SavingsAccount class extends the Account class, representing savings account with minimum balance and interest rate
public class SavingsAccount extends Account{
	private double minimumBalance; // Minimum balance in the account
	private double interestRate; // Interest rate for the savings account

	// Constructor to create a new SavingsAccount
	public SavingsAccount(Bank bank, Customer customer, int accountNumber, double balance, double minimumBalance, double interestRate) {
		super(customer, accountNumber, balance); // Initialize the Account class
		this.minimumBalance = minimumBalance; // Set minimum balance
		this.interestRate = interestRate; // Set interest rate
	}

	// Get minimum balance
	public double getMinimumBalance() {
		return minimumBalance;
	}

	// Set new minimum balance
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	// Get interest rate
	public double getInterestRate() {
		return interestRate;
	}

	// Set interest rate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// Method to calculate interest based on the balance and interest rate
	public double calculateInterest() {
		return getBalance() * (interestRate) / 100;
	}
}
