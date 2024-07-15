package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex04;

public class Menu {
	enum Machine {
		AUTO("Truck"),MEDICAL("Scanner");
		private String type;
		private Machine(String type) {
			this.type=type;
		}
		
		private void setType(String type) {
			this.type=type;	//	line1
		}
		
		private String getType() {
			return type;
		}
		
	}
	
	public static void main(String[] args) {
		
		Machine.AUTO.setType("Sedan");	//	line2
		for(Machine p:Machine.values()) {
			System.out.println(p+":"+p.getType());	//	line3
		}
	}
}

/*
What is the result? 結果是什麼？

A) The compilation fails due to an error on line 3.
編譯失敗，因為在第3行有錯誤。
B) The compilation fails due to an error on line 2.
編譯失敗，因為在第2行有錯誤。
C) AUTO: Truck
MEDICAL: Scanner
D) An exception is thrown at runtime.
運行時引發異常。
E) The compilation fails due to an error on line 1.
編譯失敗，因為在第1行有錯誤。
F) AUTO: Sedan
MEDICAL: Scanner
*/
