package edu;

public class Account {
	private String accNo;
	private int balance = 0;
	
	public Account(String accNo) {
		this.accNo = accNo;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public void save(int money) {
		this.balance += money;
	}
	
	public void deposit(int money) {
		this.balance -= money;
	}
}
