package abstractWord;

 abstract class Shape {
	public abstract double calculateArea();
	
	abstract void display();
}

class Rectangle extends Shape{

	public static final double len = 20.0, wid = 50.0;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return len * wid;
	}

	void display() {
		System.out.println("Rectangle ");
	}
}

class Circle extends Shape{

	public static final double r = 7;
	
	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * r * r;
	}

	@Override
	void display() {
		//System.out.println("Circle ");
		
	}
}

public class Main{
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		System.out.println(s1.calculateArea());
		s1.display();
		
		Shape s2 = new Circle();
		System.out.println(s2.calculateArea());
		s2.display();
	}
}