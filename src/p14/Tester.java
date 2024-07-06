package p14;

public class Tester {
	
	public static int reduce(int x) {
		int y =4;	//	final會自動加上去
		class Computer{
			int reduce(int x) {
			//	return x- y--;
				return x - y-- ;	//	因為外部的y是final所以不能夠--，只能取用，但是不能修改!!!!
			}
			
			
		}
	
		Computer a = new Computer();
		return a.reduce(x);
	}
	public static void main(String[] args) {
		System.out.println(reduce(1));
	}
	
}

/*
What is the result?
結果是什麼？

A. -3
B. The compilation fails.
   編譯失敗。

C. An exception is thrown at runtime.
   執行時拋出異常。

D. -2
*/
