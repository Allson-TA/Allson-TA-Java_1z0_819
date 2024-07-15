package PDF_Exam_Ch4_Exception_Handling.Ex09;

public class Test {
	
	private int sum;
	public int compute() {
		int x = 0;
		while(x<3) {
			sum += ++x;
		}
		return sum/4;
	}

	public static void main(String[] args) {
		
		Test t  = new Test();
		int sum = t.compute();
		sum = t.compute();
		System.out.println(sum);
		
	}
	
}
/*
What is the output?
輸出是什麼？

A) 6

B) 3

C) An exception is thrown at runtime
運行時拋出異常

D) 9
*/
