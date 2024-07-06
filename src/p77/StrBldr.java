package p77;

public class StrBldr {
	
	static StringBuilder sb1 = new StringBuilder("yo");
	StringBuilder sb2 = new StringBuilder("hi");
	
	public static void main(String[] args) {
		
		sb1 = sb1.append(new StrBldr().foo(new StringBuilder("hey")));
		System.out.println(sb1);
		
	}
	
	StringBuilder foo(StringBuilder s) {
		System.out.println(s + "oh" +sb2);
		return new StringBuilder("ey");
	}

}
/*
What is the result?
結果是什麼？

A. hey oh hi yo ey

B. yo ey

C. hey oh hi ey

D. hey oh hi

E. oh hi ey

F. A compile time error occurs.
   發生編譯時錯誤。
*/
