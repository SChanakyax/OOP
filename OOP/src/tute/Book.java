package tute;

import java.util.Scanner;

public class Book implements IDisplay, IInput{
	private String bookID;
	private String title;
	private String publisher;
	
	@Override
	public void input() {
		Scanner book = new Scanner(System.in);
		System.out.print("Enter book Id: ");
		this.bookID = book.nextLine();
		
		System.out.print("Enter book Title: ");
		this.title = book.nextLine();
				
		System.out.print("Enter book Publisher : ");
		this.publisher = book.nextLine();
	}
	@Override
	public void print() {
		System.out.println("Book Id : " + this.bookID + " Pusblisher : " + this.publisher
				+ " Title : " + this.title);
		
	}
	@Override
	public void printDetails() {
		System.out.println("Book Id : " + this.bookID + " Pusblisher : " + this.publisher
				+ " Title : " + this.title);
		
	}
}
