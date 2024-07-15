package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex09;

public class Builderlmpl implements Builder {

	@Override
	public B build(String str) {
		
		return new B(str);
	}

}
/*
Assuming that this code compiles correctly, which three statements are true? 
假設此代碼正確編譯，以下哪三個陳述是正確的？

A) A cannot be abstract. A不能是抽象的。
B) A is a subtype of B. A是B的子類型。
C) B cannot be final. B不能是final的。
D) B is a subtype of A. B是A的子類型。
E) B cannot be abstract. B不能是抽象的。
F) A cannot be final. A不能是final的。
*/
