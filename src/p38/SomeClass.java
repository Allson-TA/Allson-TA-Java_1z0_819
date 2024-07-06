package p38;

public class SomeClass {

	public void methodA() {
		System.out.println("SomeClass#methodA()");
	}
}

class AnotherClass extends SomeClass {
	public void methodA() {
		System.out.println("AnotherClass#methodA()");
	}
}

public class Test {
	public static void main(String[] args) {
		AnotherClass ac = new AnotherClass();
		SomeClass sc = new AnotherClass();
		
		ac = sc;	//	子不可以等於父
		sc.methodA();
		ac.methodA();
		
	}
}

/*
What is the result?
結果是什麼？

A. SomeClass#methodA()
   AnotherClass#methodA()
   SomeClass 的 methodA() 和 AnotherClass 的 methodA() 都被調用。

B. A ClassCastException is thrown at runtime
   在運行時拋出 ClassCastException 異常。

C. AnotherClass#methodA()
   AnotherClass#methodA()
   兩次都調用了 AnotherClass 的 methodA()。

D. The compilation fails.
   編譯失敗。

E. SomeClass#methodA()
   SomeClass#methodA()
   兩次都調用了 SomeClass 的 methodA()。

F. AnotherClass#methodA()
   SomeClass#methodA()
   先調用了 AnotherClass 的 methodA()，然後調用了 SomeClass 的 methodA()。
*/
