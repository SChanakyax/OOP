package threadPaper_1;

public class MainThreadApp {

	public static void main(String[] args) {
	
		//extends
		//Thread CountDown = new Thread();
		Thread CountDown = new Thread(new CountDown());
		
		
		//implements
		Thread CalcSum1 = new Thread(new CalcSum());
		Thread CalcSum2 = new Thread(new CalcSum());

		CalcSum1.setName("Black"); //thread name
		CalcSum2.setName("White");
		
		
		CountDown.start();
		try {
			CountDown.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //
		
		CalcSum1.start();
		try {
			CalcSum1.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		CalcSum2.start();
		try {
			CalcSum2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
