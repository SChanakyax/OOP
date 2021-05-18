package thread_implementation_im;

public class ChildThread implements Runnable{
	public void run() {
		for(int i=0; i<5 ;i++) {
			System.out.println("This is Child Thread > < " + i);
		}
	}
}
