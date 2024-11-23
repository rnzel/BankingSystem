package com.OOP;

// The CheckingAccount class extends the Account class and adds an overdraft limit feature
public class CheckingAccount extends Account{
	private double overdraftLimit; // Maximum amount the account can go into negative balance

	// Constructor to create a CheckingAccount
	public CheckingAccount(Bank bank, Customer customer, int accountNumber, double balance, double overdraftLimit) {
		super(customer, accountNumber, balance); // Calls the constructor of the parent Account class
		this.overdraftLimit = overdraftLimit; // Sets the overdraft limit
	}

	// Get the overdraft limit for the account
	public double getOverdraftLimit() {
		return overdraftLimit;
	}

	// Set a new overdraft limit for the account
	public void setOverdraftLimi(double overdraftLimit) {
		this.overdraftLimit = overdraftLimit;
	}

	// Override the withdraw method to allow overdraft withdrawals
	public void withdraw(double amount) {
		// Check if the withdrawal amount is within the balance and overdraft limit
		if (amount <= getBalance() + overdraftLimit) {
			setBalance(getBalance() - amount); // Deduct the amount from the balance
			System.out.println("Withdrawal Successfully"); // / Display success message if withdrawal was successful
		} else {
			System.out.println("Insufficient balance..."); // Display error message if the limit is exceeded
		}
	}
}
