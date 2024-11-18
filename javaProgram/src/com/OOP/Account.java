package com.OOP;

public class Account {
	private int accountNumber;
	private double balance;
	private Customer customer;
	
	public Account(Customer customer, int accountNumber, double balance) {
		this.customer = customer;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public void deposit(double amount) {
		if (amount > 500) {
			balance += amount;
		} else {
			System.out.println("Deposit amount must be at least 500...");
		}
	}
	
	public void withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}
}
