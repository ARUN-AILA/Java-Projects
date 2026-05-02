package BankAccountManagement;

public class Account {
	
	int id;
	int customer_id;
	double balance;
	String type;
	
	Account(int id , int customer_id , double balance , String type){
		this.id = id;
		this.customer_id = customer_id;
		this.balance = balance;
		this.type = type;
	}
	
	void deposit(double amount) {
		balance = balance + amount;
	}
	
	void withdraw(double amount) {
		if(balance>=amount) {
			balance = balance - amount;
		}
		else {
			System.out.println("Insufficient balance in account " + id);
		}
	}

}
