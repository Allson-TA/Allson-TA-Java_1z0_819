package p76;

public class Test {

	private int sum;
	public int compute() {
		int x = 0;
		while(x<3) {
			sum += ++x;
		}
		return sum / 4;
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		int sum = t.compute();
		sum = t.compute();
		t.compute();
		System.out.println(sum);
		

	}

}
/*
What is the result?
結果是什麼？

A. 6
   6

B. 9
   9

C. 3
   3

D. An exception is thrown at runtime.
   運行時拋出異常。
*/
