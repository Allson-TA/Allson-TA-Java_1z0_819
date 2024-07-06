package p116;

public class B extends A{

	public int modifyVal(int val) {
		if(checkValue(val)) {
			return val;
		} else {
			return 0;
		}
	
	}
	public static void main(String[] args) {
		B b =new B();
		System.out.println(b.modifyVal(10));
	}
	
}
/*
What is the result?
結果是什麼？

A. 10
B. 0
C. nothing
D. It fails to compile
   它無法編譯
E. A java.lang.IllegalArgumentException is thrown
   拋出 java.lang.IllegalArgumentException
*/
