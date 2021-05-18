package lab3_1;

public class Student {
	private String name;
	private String ditno;
	private String address;
	
	public Student(String n, String no, String add) {
		this.name = n;
		this.ditno = no;
		this.address = add;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setNo(String no) {
		this.ditno = no;
	}
	
	public String getNo() {
		return this.ditno;
	}
	public void setAddress(String add) {
		this.address = add;
	}
	
	public String getAddress() {
		return this.address;
	}

	public String getDetails() {
		String s = "I am a Student" +"\nMyName " + this.name + "\nITNO " + this.ditno + " Address " + this.address;
		return s;
	}
}
