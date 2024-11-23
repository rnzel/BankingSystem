package com.OOP;
import java.util.ArrayList;

// The Customer class represents a bank customer, storing their name, address, accounts and loans
public class Customer{
	private String name; // Customer's name
	private String address; // Customer's address
	private ArrayList<Account> accounts; // List of accounts owned by the customer
	private ArrayList<Loan> loans; // List of loans taken by the customer

	// Constructor to create a customer with a name and address
	public Customer(String name, String address) {
		this.name = name; // Set the customer's name
		this.address = address; // Set the customer's address
		this.accounts = new ArrayList<>(); // Initialize empty account list
		this.loans = new ArrayList<>(); // Initialize loan list
	}

	// Get the customer's name
	public String getName() {
		return name;
	}

	// Set new name for the customer
	public void setName(String name) {
		this.name = name;
	}

	// Get the customer's address
	public String getAddress(){
		return address;
	}

	// Set new address for the customer
	public void setAddress(String address) {
		this.address = address;
	}

	// Get the list of accounts owned by the customer
	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	// Set a new list of accounts
	public void setAccounts(ArrayList<Account> accounts){
		this.accounts = accounts;
	}

	 // Get the list of loans taken by the customer
	public ArrayList<Loan> getLoans(){
		return getLoans();
	}

	// Set a new list of loans
	public void setLoans(ArrayList<Loan> loans) {
		this.getLoans();
	}

	// Add a new account to the customer's list of accounts
	public void addAccount(Account account) {
		accounts.add(account);
	}

	// Remove an account from the customer's list of accounts
	public void removeAccount(Account account) {
		accounts.remove(account);
	}

	// Add new loan to the customer's list of loans
	public void addLoan(Loan loan) {
		loans.add(loan);
	}

	// Remove loan from the customer's list of loans
	public void removeLoan(Loan loan) {
		loans.remove(loan);
	}
}
