package p86;

public class Scope {

	static int myint = 777;
	
	public static void main(String[] args) {
		
		int myint = myint;
		System.out.println(myint);

	}

}
/*
Which is true?
哪個敘述是正確的？

A. The code does not compile successfully.
   程式碼無法成功編譯。

B. Code compiles but throws a runtime exception when run;
   程式碼編譯成功，但執行時會拋出運行時異常。

C. The code compile and runs successfully but with a wrong answer(i.e., a bug)
   程式碼編譯並成功運行，但答案錯誤（即，有錯誤）。

D. It print 777;
   程式輸出777。
*/
