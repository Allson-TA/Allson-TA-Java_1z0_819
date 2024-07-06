package p40;

public class Car extends Automobile {
	
	void wheels(int i) {	//	line3
		System.out.println(4);
	}
	
	public static void main(String[] args) {
		Automobile ob = new Car();	// line4
		ob.wheels();
	}
	
}
