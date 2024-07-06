package p114;

import java.util.List;

public class p114 {

	public static void main(String[] args) {
		
		var Ist = List.of(1,2.0f,"4.0");
		for(var c:Ist) {
			System.out.println(">"+c);
		}
		
		System.out.println();
		Ist.add(2,3);	//	line1
		for(int c = 0;c<Ist.size();c++) {
			display(Ist.get(c));
		}
		
	}
	
	public static void display(var c) {	//	line n2
		System.out.println(">"+c);
	}
	
}
/*
What is the result?
結果是什麼？

A. A compile time error occurs at line n2.
   第 n2 行發生編譯時錯誤。

B. An exception is thrown at line n1
   第 n1 行拋出異常。

C. > 1> 2.0> 4.0
   > 1> 2.0> 3> 4.0

D. > 1> 2.0> 4.0
   > 1> 2.0> 4.0
*/
