package threadImplementation;

public class MainThread extends Thread {

	public static void main(String[] args) {
		MainThread mt1 = new MainThread();
		mt1.start();

		ChildThread ct1 = new ChildThread();
		ct1.start();
	}
	
	public void run() {
		for(int i=0; i< 10; i++) {
			System.out.println("Hello Main Thread Class  >> " +  i );
			
			try {
				Thread.sleep(100);
			}catch(InterruptedException e) {
				System.out.println("Exception e");
			}
			
		}
	}
	

}
