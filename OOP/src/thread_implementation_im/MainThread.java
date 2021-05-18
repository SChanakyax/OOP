package thread_implementation_im;


public class MainThread {

	public static void main(String[] args) {
		Thread thread = new Thread(new ChildThread());
		thread.start();
	}
	
	
	

}
