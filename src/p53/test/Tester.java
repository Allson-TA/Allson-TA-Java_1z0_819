package p53.test;

import p53.t1.A;
import p53.t2.B;

public class Tester {
	
	public static void main(String[] args) {
		
		A obj = new B();	//	line4

		System.out.println(obj.x);	//	line5
	}
	
}
	
/*
What is the result?
結果是什麼？

A. The compilation fails due to an error in line 5.
   編譯失敗，因為第 5 行有錯誤。

B. 42

C. The compilation fails due to an error in line 2.
   編譯失敗，因為第 2 行有錯誤。

D. The compilation fails due to an error in line 1.
   編譯失敗，因為第 1 行有錯誤。

E. The compilation fails due to an error in line 3.
   編譯失敗，因為第 3 行有錯誤。

F. 17

G. The compilation fails due to an error in line 4.
   編譯失敗，因為第 4 行有錯誤。
*/
