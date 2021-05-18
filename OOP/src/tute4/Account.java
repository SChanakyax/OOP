package tute4;

public abstract class Account {
	private String accNo;
	protected String name;
	protected double balance;
	
	public Account() {
		
	}
	
	public Account(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	
	public void Deposit(double de) {
		this.balance += de;
	}

	public abstract double calculateInterest(); 
	
	public void display() {
		System.out.println("AccNo : " + this.accNo + " name : " + this.name
				+ " Balance : " + this.balance);
	}
	
}
