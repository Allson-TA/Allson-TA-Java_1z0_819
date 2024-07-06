package p45;

public class p45 {

	public static void main(String[] args) {
		
		char d =100, e = 'e';	//	line1
		int x =d;				//	line2
		int y = (int)e;			//	line3 97
		System.out.println((char)x+(char)y);
		
		//	ACSII Code = e --> 101
		//	A --> 65 | a --> 97
		//	兩個char可以相加 d --> 100 + e --> 101
		//	201

	}

}

/*
What is the result?
結果是什麼？

A. The compilation fails due to an error in line 3.
   編譯失敗，因為第3行有錯誤。

B. de
   de

C. 203
   203

D. The compilation fails due to an error in line 2.
   編譯失敗，因為第2行有錯誤。

E. The compilation fails due to an error in line 1.
   編譯失敗，因為第1行有錯誤。

F. 201
   201
*/
