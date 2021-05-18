package tute1_2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Feet a1 = new Feet(5, 6);
		Feet a2 = new Feet(6, 7);
		Feet obj = new Feet(0, 0);
		obj.add(a1, a2);
		obj.print();
		obj.print("Sexy ");
	}

}
