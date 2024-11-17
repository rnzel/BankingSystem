package com.OOP;

public class Bank {
	private String name;
	private int code;
	private ArrayList<Account> accounts;
	private ArrayList<Loan> loans;
	
	public Bank(String name, int code) {
		this.name = name;
		this.code = code;
	}
	
	String getName() {
		return name;
	}
	
	void setName(String name) {
		this.name = name;
	}
	
	int getCode() {
		return code;
	}
	
	void setCode(int code) {
		this.code = code;
	}
	
	ArrayList<Account> getAccounts(){
		return accounts;
	}
	
	void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	ArrayList<Loans> getLoans(){
		return loans;
	}
	
	void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}
	
	void addAccount(Account account) {
		
	}
	void removeAccount(Account account) {
		
	}
	
	void addLoan(Loan loan) {
		
	}
	
	void removeLoan(Loan loan) {
		
	}
}
