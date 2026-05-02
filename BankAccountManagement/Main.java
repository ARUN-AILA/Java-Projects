package BankAccountManagement;

import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {

		List<Customer> customers = new ArrayList<>(Arrays.asList(new Customer(1, "Arun", "Hyderabad"),
				new Customer(2, "Ram", "Banglore"), new Customer(3, "Raj", "Chennai")

		));

		List<Account> accounts = new ArrayList<>(Arrays.asList(new Account(101, 1, 5000, "Savings"),
				new Account(102, 2, 3000, "Current"), new Account(103, 3, 1500, "Savings")

		));
		// deposit
		accounts.stream().filter(a -> a.id == 101).forEach(a -> a.deposit(2000));

		// withdraw

		accounts.stream().filter(a -> a.id == 102).forEach(a -> a.withdraw(1000));

		// remove low balance(<2000)

		accounts.removeIf(a -> a.balance < 2000);

		Map<Integer, Customer> customerMap = customers.stream().collect(Collectors.toMap(c -> c.id, c -> c));

		System.out.println("Customers from Hyderabad:");
		customers.stream().filter(c -> c.city.equals("Hyderabad")).forEach(c -> System.out.println(c.name));
		
		System.out.println("Accounts with balance>5000:");
		
		accounts.stream().filter(a->a.balance>5000).forEach(a->System.out.println(a.id+"->"+(int)a.balance));
		
		System.out.println("Sorted Accounts:");
        accounts.stream().sorted((a,b)->Double.compare(b.balance,a.balance)).forEach(a->System.out.println(a.id+"->"+(int)a.balance));	
        
        
        System.out.println("Account-Customer Mapping:");
        accounts.forEach(a->{
        	Customer c = customerMap.get(a.customer_id);
        	if(c!=null)
        		System.out.println(a.id+"->"+c.name+"->"+(int)a.balance);
        	
        });
		
		
		
	}

}
