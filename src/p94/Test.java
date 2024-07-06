package p94;

public class Test implements AbilityA , AbilityB {	//	line 1

	@Override
	public void action() {
		System.out.println("ab action");
		
	}
	
	public static void main(String[] args) {
		AbilityB x = new Test();	//	line 2
		x.action();
	}
}
/*
What is the result?
結果是什麼？

A. a action
B. The compilation fails on line 1
   編譯在第 1 行失敗
C. An exception is thrown at run time
   運行時拋出異常
D. ab action
E. The compilation fails on line 2
   編譯在第 2 行失敗
*/
