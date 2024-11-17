package com.OOP;

public class Account extends Bank {
	private int accountNumber;
	private double balance;
	private Customer customer;
	
	public account(Customer customer, int accountNumber, double balance) {
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	int getAccountNumber() {
		return accountNumber;
	}
	
	void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	double getBalance() {
		return balance;
	}
	
	void setBalance(double balance) {
		this.balance = balance;
	}
	
	Customer getCustomer() {
		return customer;
	}
	
	void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	void deposit(double amount) {
		balance += amount;
	}
	
	void withdraw(double amount) {
		balance -= amount;
	}
}
