package com.OOP;

public class main {

	public static void main(String[] args) {
		Bank bank = new Bank("First Bank", 1010);
		Customer customer = new Customer("Liezel Anne Guim", "Bulan, Sorsogon");
		Account account = new SavingsAccount(bank, customer, 23163119, 100000.0, 500.0, 1.0);
		Loan loan = new Loan(bank, customer, 1, 1000.0, 1.5);
		bank.addAccount(account);
		bank.addLoan(loan);
		customer.addAccount(account);
		customer.addLoan(loan);
		System.out.println("Bank : " + bank.getName());
		System.out.println("Account Balance : " + account.getBalance());
		System.out.println("Loan : " + loan.getPrincipalAmount());
	}

}
