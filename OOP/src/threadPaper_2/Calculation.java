package threadPaper_2;

public class Calculation{

	private double ans = 1;
	
	public double getAns() {
		return ans;
	}
	
	public void factorial(int start, int end) {
		System.out.println(start + end);
		
		for(int i=start; i<= end; i++) {
			ans *= (double)i;
		}
		
		
	}
	
}
