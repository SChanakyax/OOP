package threadLab3_1;

public class Deadlock {
	public static Object lock1 = new Object();
	public static Object lock2 = new Object();
	
	public static void main(String[] args) {
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		
		threadOne.start();
		threadTwo.start();
		
	}
}

static class ThreadOne extends Thread {
	public void run() {
		System.out.println("Thread one start...");
		
		synchronized (lock1) {
			System.out.println("Thread 1 holding lock1.........");
			
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("Thread 1 i s waiting for lock2");
			
			synchronized(lock2) {
				System.out.println("Thread 1 is holding lock 1 and lock2");
			}
		}
	}
}



























































