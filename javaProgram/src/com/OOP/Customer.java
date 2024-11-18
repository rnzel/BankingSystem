package com.OOP;
import java.util.ArrayList;

public class Customer{
	private String name;
	private String address;
	private ArrayList<Account> accounts;
	private ArrayList<Loan> loans;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
		this.accounts = new ArrayList<>();
		this.loans = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	public void setAccounts(ArrayList<Account> accounts){
		this.accounts = accounts;
	}
	
	public ArrayList<Loan> getLoans(){
		return getLoans();
	}
	
	public void setLoans(ArrayList<Loan> loans) {
		this.getLoans();
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
