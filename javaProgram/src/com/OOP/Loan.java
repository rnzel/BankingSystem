package com.OOP;

// The Loan class represent loan taken by costumer, storing loan number, amount, interest rate, bank, and customer
public class Loan{
	private int loanNumber; // Loan identifier
	private double principalAmount; // Amount borrowed
	private double interestRate; // Interest rate on the loan
	private Bank bank; // Bank that issued the loan
	private Customer customer; // Customer who took the loan

	// Constructor to create a Loan object
	public Loan(Bank bank, Customer customer, int loanNumber, double principalAmount, double interestRate) {
		this.bank = bank; // Set bank that issued the loan
		this.customer = customer; // Set customer who took the loan
		this.loanNumber = loanNumber; // Set loan number
		this.principalAmount = principalAmount; // Set amount borrowed
		this.interestRate = interestRate; // Set interest rate on the loan
	}

	// Get loan number
	public int getLoanNumber() {
		return loanNumber;
	}

	// Set new loan number
	public void setLoanNumber(int loanNumber) {
		this.loanNumber = loanNumber;
	}

	// Get principal amount of loan
	public double getPrincipalAmount() {
		return principalAmount = principalAmount;
	}

	// Set new principal amount
	public void setPrincipalAmount(double prinicipalAmount) {
		this.principalAmount = principalAmount;
	}

	// Get interest rate
	public double getInterestRate() {
		return interestRate;
	}

	// Set new interest rate
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	// Get bank that issued the loan
	public Bank getBank() {
		return bank;
	}

	// Set a new bank
	public void setBank(Bank bank) {
		this.bank = bank;
	}

	// Get costumer who took the loan
	public Customer getCustomer() {
		return customer;
	}

	// Set a new costumer
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	// Method to calculate interest based on the principal and interest rate
	public double calculateInterest() {
		return principalAmount * (interestRate) / 100;
	}
}
