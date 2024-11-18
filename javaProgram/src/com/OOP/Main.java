package com.OOP;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// To get an input from users
		Scanner scanner = new Scanner(System.in);
		
		/*Bank bank = new Bank("First Bank", 1010);
		Customer customer = new Customer("Liezel Anne Guim", "Bulan, Sorsogon");
		Account account = new SavingsAccount(bank, customer, 23163119, 100000.0, 500.0, 1.0);
		Loan loan = new Loan(bank, customer, 1, 1000.0, 1.5);
		bank.addAccount(account);
		bank.addLoan(loan);
		customer.addAccount(account);
		customer.addLoan(loan);
		System.out.println("Bank : " + bank.getName());
		System.out.println("Account Balance : " + account.getBalance());
		System.out.println("Loan : " + loan.getPrincipalAmount());*/
		
		System.out.print("Enter the Bank Name :");
		String bankName = scanner.nextLine();
		
		System.out.print("Enter Bank Code : ");
		int bankCode = scanner.nextInt();
		
		scanner.nextLine();
		
		Bank bank = new Bank(bankName, bankCode);
		
		System.out.print("Name : ");
		
		
		scanner.close();
	}
}