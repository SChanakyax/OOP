package tute;

import java.util.Scanner;

public class Student implements IDisplay, IInput{
	private String studentID;
	private String name;
	
	public void input() {
		Scanner student = new Scanner(System.in);
		System.out.print("Enter studentID : ");
		this.studentID = student.nextLine();
		
		System.out.print("Enter Student name: ");
		this.name = student.nextLine();
		
		student.close();
	}
	
	public void print() {
		System.out.println("Student Id : " + this.studentID + " name : " + this.name
);
		
	}
	
	public void printDetails() {
		System.out.println("studentID : " + this.studentID 
				+ " name : " + this.name);
		
	}
	
	
}
