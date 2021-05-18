package tute4;

public class SavingAccount extends FixedDeposit{

	public SavingAccount() {
		
	}
	
	public SavingAccount(String accNo, String name, double balance) {
		super(accNo, name, balance);
	
	}
	
	public void withdraw(double amount) {
		balance = balance - amount;
	}

	public double calculateInterest() {
		this.interest = balance * interestRate / 100 / 12;
		return interest;
	}
	
}
