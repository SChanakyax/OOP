package lab3_2;

public class Student extends Person{

	String sId;
	
	public Student(String n, String a, String sid) {
		 super(n, a);
		 this.sId = sid;
		
	}
	
	
	public void showDetails() {
		super.showDetails();
		System.out.println("Student >> " + sId);
	}

}
