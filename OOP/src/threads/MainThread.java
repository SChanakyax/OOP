package threads;

public class MainThread {

	public static void main(String[] args) {
		ChildThread t1 = new ChildThread();
		t1.start();
		ChildThread t2 = new ChildThread();
		t2.start();
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Exception");
		}
		
	}

}
