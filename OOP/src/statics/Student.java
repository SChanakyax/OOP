package statics;

public class Student {

	private String name;
	private int age;
	private static String school;
	
	public Student(String sname, int sage) {
		this.name = sname;
		this.age = sage;
	//	this.school = sschool;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	/*
	public void setSchool(String setschool) {
		school = setschool;
	}*/
	
	public static void setSchool(String setschool) {
		school = setschool;
	}
	
	public String getSchool() {
		return school;
	}
	
	/**/
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void display() {
		System.out.println("name : " + this.name + "    Age: "+ this.age +"  School : " + getSchool());
	}
	
}

