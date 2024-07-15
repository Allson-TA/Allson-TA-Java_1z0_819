package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex12;

public class Test implements AbilityA,AbilityB {	//	line1
	
	public void action() {
		System.out.println("ab action");
	}
	
	public static void main(String[] args) {
		AbilityB x = new Test();	//	line2
		x.action();
	}

}

/*
What is the result? 結果是什麼？

A) The compilation fails on line 1. 編譯在第1行失敗
B) An exception is thrown at run time. 執行期間拋出異常
C) The compilation fails on line 2. 編譯在第2行失敗
D) a action
E) ab action
*/
