package com.codegnan.projects;

public class InsufficientBalanceException extends Exception {
	
	private double balance;
	private double withDrawAmount;

	public InsufficientBalanceException(double balance,double withdrawamount) {
		
		super("Insufficient balance,available balance :"+balance+"But you have requested :"+withdrawamount);
	
	
	this.balance=balance;
	this.withDrawAmount = withDrawAmount;
	
}
}