package threadPaper_1;

public class CountDown extends Thread{


	public void run() {
		
		System.out.println("KKKKKKKK");
		
		synchronized (CountDown.class) {
			
			System.out.println("HIIIIIIIIII");
			for(int i = 0; i<10 ; i++) {
				System.out.println(i+1);
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
		}
	}
}
