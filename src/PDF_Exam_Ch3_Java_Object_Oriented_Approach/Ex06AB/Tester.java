package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex06AB;

import PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex06A.*;
import PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex06B.*;

public class Tester {
	
	public static void main(String[] args) {
		
		A obj = new B();	//	line4
		System.out.println(obj.x);
		
	}

}

/*
What is the result?  結果是什麼？

A) The compilation fails due to an error in line 4
編譯失敗，因為在第4行出錯

B) 17

C) The compilation fails due to an error in line 2
編譯失敗，因為在第2行出錯

D) The compilation fails due to an error in line 3
編譯失敗，因為在第3行出錯

E) The compilation fails due to an error in line 1
編譯失敗，因為在第1行出錯

F) The compilation fails due to an error in line 5
編譯失敗，因為在第5行出錯

G) 42
*/
