package tute4;

public class Main {

	public static void main(String[] args) {
		
	/*	
		FixedDeposit fd1 = new FixedDeposit("1212", "DArshana" ,10000);
		SavingAccount sa1 = new SavingAccount("1000", "SAma", 10);
		*/
		Account fd1 = new FixedDeposit();
		SavingAccount sa1 = new SavingAccount();
		
		fd1.Deposit(5000);
		
		sa1.Deposit(10);
		sa1.withdraw(20);
		
		fd1.display();
		
		sa1.display();
		
	}

}
