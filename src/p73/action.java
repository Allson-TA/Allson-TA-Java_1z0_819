package p73;


public class action implements AbilityA,AbilityB{


	@Override
	public void action() {
		System.out.println("ab action");
		
	}
	
	public static void main(String[] args) {
		
		AbilityB x = new action();
		x.action();
		
	}

}
/*
What is the result?
結果是什麼？

A. a action
   a action

B. ab action
   ab action

C. An exception is thrown at run time.
   執行時拋出異常。

D. The compilation fails on line 1.
   第1行編譯失敗。

E. The compilation fails on line 2.
   第2行編譯失敗。
*/
