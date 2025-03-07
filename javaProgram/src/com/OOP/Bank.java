package com.OOP;

import java.util.ArrayList;

public class Bank{
	private String name;
	private int code;
	private ArrayList<Account> accounts;
	private ArrayList<Loan> loans;
	
	public Bank(String name, int code) {
		this.name = name;
		this.code = code;
		this.accounts = new ArrayList<>();
		this.loans = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public ArrayList<Account> getAccounts(){
		return accounts;
	}
	
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	
	public ArrayList<Loan> getLoans(){
		return loans;
	}
	
	public void setLoans(ArrayList<Loan> loans) {
		this.loans = loans;
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	public void removeAccount(Account account) {
		accounts.remove(account);
	}
	
	public void addLoan(Loan loan) {
		loans.add(loan);
	}
	
	public void removeLoan(Loan loan) {
		loans.remove(loan);
	}
}
