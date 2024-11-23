package com.OOP;

import java.util.ArrayList;

// The Bank class represents a bank entity, managing its name, code, and lists of accounts and loans
public class Bank{
	// Private fields to store the bank's name, code, and collections of accounts and loans
	private String name; // Name of the bank
	private int code; // Code for the bank
	private ArrayList<Account> accounts; // List of accounts in the bank
	private ArrayList<Loan> loans; // List of loans in the bank

	// Constructor to create a Bank object
	public Bank(String name, int code) {
		this.name = name; // Set the bank's name
		this.code = code; // Set the bank's code
		this.accounts = new ArrayList<>(); // Initialize the accounts list
		this.loans = new ArrayList<>(); // Initialize the loans list
	}

	// Get the bank's name
	public String getName() {
		return name;
	}

	//  Set the bank's name
	public void setName(String name) {
		this.name = name;
	}

	 // Get the bank's code
	public int getCode() {
		return code;
	}

	// Set the bank's code
	public void setCode(int code) {
		this.code = code;
	}

	// Get the list of accounts
	public ArrayList<Account> getAccounts(){
		return accounts;
	}

	// Set a new list of accounts
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	// Get the list of loans
	public ArrayList<Loan> getLoans(){
		return loans;
	}

	// Set a new list of loans
	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}

	// Add a new account to the bank
	public void addAccount(Account account) {
		accounts.add(account);
	}

	// Remove an account from the bank
	public void removeAccount(Account account) {
		accounts.remove(account);
	}

	// Add a new loan to the bank
	public void addLoan(Loan loan) {
		loans.add(loan);
	}

	// Remove a loan from the bank
	public void removeLoan(Loan loan) {
		loans.remove(loan);
	}
}
