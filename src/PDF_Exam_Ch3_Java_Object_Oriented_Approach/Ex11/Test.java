package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex11;

public class Test {
	
	public static void main(String[] args) {
		
		AnotherClass ac = new AnotherClass();
		SomeClass sc = new AnotherClass();
		ac = sc;
		sc.methodA();
		ac.methodA();
		
	}

}

/*
What is the result? 結果是什麼？

A) A ClassCastException is thrown at runtime. 執行期間拋出 ClassCastException。
B) SomeClass#methodA() 
   AnotherClass#methodA()
C) AnotherClass#methodA() 
   AnotherClass#methodA()
D) The compilation fails 編譯失敗
E) AnotherClass#methodA() 
   SomeClass#methodA()
F) SomeClass#methodA() 
   SomeClass#methodA()
*/
