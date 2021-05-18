package threadPaper_1;

public class CalcSum implements Runnable{

	private int sum = 0;
	
	
	public void run() {
		
		synchronized(CalcSum.class) {
			for(int i = 0; i<1000 ; i++) {
				sum+=i;
				
				//System.out.println(i+1);
			}
			
			System.out.println(sum + "Thread : " + Thread.currentThread().getName());
		}
		
		//System.out.println(sum);
		
	}
	
}
