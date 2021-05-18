package threadPaper_2;

public class MainThreadApp {

	public static void main(String[] args) {
		
		Calculation c = new Calculation(); 
		
		Thread Cal  = new Thread(new ParellelThread(c, 1 ,10));
		Thread Cal2  = new Thread(new ParellelThread(c, 11 ,20));
		Thread Cal3  = new Thread(new ParellelThread(c, 21 ,30));
		Thread Cal4  = new Thread(new ParellelThread(c, 31 ,40));
		
		Cal.start();
		try {
			Cal.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
