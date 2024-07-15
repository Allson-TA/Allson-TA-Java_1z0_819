package PDF_Exam_Ch1_Working_With_Java_Data_Types.Ex05;

public class StrBldr {

	static StringBuilder sb1 = new StringBuilder("yo");
	StringBuilder sb2 = new StringBuilder("hi");
	
	public static void main(String[] args) {
		
		sb1 = sb1.append(new StrBldr().foo(new StringBuilder("hey")));
		System.out.println(sb1);
		
	}
	
	StringBuilder foo(StringBuilder s) {
		System.out.println(s+"oh"+sb2);
		return new StringBuilder("ey");
	}

}

/*
What is the result?  結果是什麼？
A) oh hi hey
B) hey oh hi
C) A compile time error occurs.  發生編譯時錯誤
D) hey oh hi yo ey
E) yo ey
F) hey oh hi ey
*/
