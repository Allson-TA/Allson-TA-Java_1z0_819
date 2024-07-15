package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex08;

public class Price {
	
	private final double value;
	public Price(String value) {
		this(Double.parseDouble(value));
	}
	
	public Price(double value) {
		this.value = value;
	}
	
	public Price() {}
	public double getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		
		Price p1 = new Price("1.99");
		Price p2 = new Price(2.99);
		Price p3 = new Price();
		System.out.println(p1.getValue()+","+p2.getValue()+","+p3.getValue());
	}

}

/*
What is the result? 結果是什麼？

A) 1.99,2.99,0.0
B) 1.99,2.99
C) The compilation fails 編譯失敗
D) 1.99,2.99,0
*/

