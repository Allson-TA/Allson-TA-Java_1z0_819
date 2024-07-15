package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex05;

class Scope {
	
	static int myint = 666;
	
	public static void main(String[] args) {
		
		int myint = myint;
		System.out.println(myint);
		
	}

}

/*
Which is true? 哪一個是正確的？

A) Code compiles but throws a runtime exception when run.
代碼編譯通過但在運行時拋出異常。

B) It prints 666
它打印 666。

C) The code compiles and runs successfully but with a wrong answer (i.e., a bug).
代碼編譯並成功運行，但答案錯誤（即，存在錯誤）。

D) The code does not compile successfully.
代碼未成功編譯。
*/
