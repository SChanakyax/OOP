package threadImplementation;

public class ChildThread extends Thread{
 
	public void run() {
		for(int i=0; i<5 ;i++) {
			System.out.println("This is Child Thread > < " + i);
		}
	}
}
