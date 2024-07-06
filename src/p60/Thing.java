package p60;

public class Thing {
	
	int x,y,z;
	public Thing() {
		this(2,1);
		System.out.println(x+","+y+","+z);
	}
	public Thing(int x) {
		System.out.println(x+","+y+","+z);
	}
	
	public Thing(int x, int y) {
		this(2);
		System.out.println(x+","+y+","+z);
	}



	public static void main(String[] args) {
		Thing t1 = new Thing();
		System.out.println();
		

	}

}
