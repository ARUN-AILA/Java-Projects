package com.codegnan.projects;

public class BankAccount {

	private String accountNumber;
	private double balance;

	BankAccount(String accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void deposit(double amount) throws InvalidAmountException {
		if (amount <= 0) {
			throw new InvalidAmountException("Deposit Amount must be Positive");

		} else {
			balance = balance + amount;
		}
	}

	public void withdraw(double amount) throws InvalidAmountException,InsufficientBalanceException {
		if (amount <= 0) {
			throw new InvalidAmountException("withdraw Amount must be Positive");
		} else {
			if (amount > balance) {
				// throw new InsufficientBalanceException(balance,amount);
			} else {
				balance = balance - amount;
//				balance-=amount;
				System.out.printf("withdrawn: Rs.%.2f%n ",amount);
				
			}
		}

	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
