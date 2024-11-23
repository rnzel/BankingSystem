package com.OOP;

// The Account class represents a bank account, encapsulating details such as account number, balance, and the associated customer.
public class Account {
	// Private fields to store the account number, balance, and the associated customer.
	private int accountNumber; // Account number
	private double balance; // Current balance in the account
	private Customer customer; // Owner of the account

	// Constructor to create an Account object
	public Account(Customer customer, int accountNumber, double balance) {
		this.customer = customer; // Assign the costumer to the account
		this.accountNumber = accountNumber; // Set the account number
		this.balance = balance; // Set the initial balance
	}

	// Get the account number
	public int getAccountNumber() {
		return accountNumber;
	}

	// Set a new account number
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// Get the current balance
	public double getBalance() {
		return balance;
	}

	// Update the balance
	public void setBalance(double balance) {
		this.balance = balance;
	}

	// Get the costumer who owns the account
	public Customer getCustomer() {
		return customer;
	}

	// Set a new costumer for the account
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	// Method to deposit an amount into the account
	public void deposit(double amount) {
		if (amount > 500) { // Check if the deposit is more than 500
			balance += amount; // Add the amount to the balance
		} else {
			System.out.println("Deposit amount must be at least 500..."); // Display error message for insufficient deposit amount
		}
	}
	
	// Method to withdraw an amount from the account
	public void withdraw(double amount) {
		if (amount < balance) { // Check if there is enough money to withdraw
			balance -= amount; // Deduct the amount from the balance
		} else {
			System.out.println("Insufficient balance"); // Display error message for insufficient funds
		}
	}
}
