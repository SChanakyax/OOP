package threadPaper_2;

public class ParellelThread implements Runnable{

	private Calculation cal;
	private int start;
	private int end;
	
	
	public ParellelThread(Calculation cal, int start, int end) {
		super();
		cal = cal;
		start = start;
		end = end;
	}
	
	public void run() {
		synchronized(ParellelThread.class) {
			
			cal.factorial(start, end);
			
		}
	}
	
	
}
