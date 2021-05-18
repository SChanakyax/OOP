package statics;

public class Main {

	public static void main(String[] args) {
		
		Student s1 = new Student("AMal",15);
		Student s2 = new Student("Sillma",13);
		
	//	s1.setSchool("Kandy Royal");
		Student.setSchool("AMrapala");
		
		s1.display();
		//System.out.println("  School : " + s1.getSchool());
		s2.display();
		
	}
}
