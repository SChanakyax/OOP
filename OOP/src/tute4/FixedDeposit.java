package tute4;

public class FixedDeposit extends Account {
	protected double interestRate;
	protected double interest;
	
	public FixedDeposit() {
		
	}
	
	public FixedDeposit(String accNo, String name, double balance) {
		super(accNo, name, balance);
	}
	
	public void setIRate(double ir) {
		 this.interestRate = ir;
	}
	
	public double getIRate() {
		return this.interestRate;
	}
	
	public double calculateInterest() {
		this.interest = balance * this.interestRate / 100;
		return interest;
	}
	
	
}
