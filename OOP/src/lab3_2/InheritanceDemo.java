package lab3_2;

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Person p1 = new Person("SAMAN" , "Kandy");
		
		Student s1 = new Student("SAMAN" , "Kandy","12121");
		//s1.showDetails();
		//p1.showDetails();
		
		PartTimeStudent pt1 = new PartTimeStudent("SAMAN" , "Kandy","12121", 6);
		
		pt1.showDetails();
				
	}

}
