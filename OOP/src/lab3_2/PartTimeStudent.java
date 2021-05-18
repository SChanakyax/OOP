package lab3_2;

public class PartTimeStudent extends Student{

	int wH;
	
	public PartTimeStudent(String n, String a, String sid, int wH) {
		super(n, a, sid);
		this.wH = wH;
		
	}

	public void showDetails() {
		super.showDetails();
		System.out.println("Working H >> " + wH);
	}
	
}
