package p88;

public class Test {
	
	public void proccess(byte v) {
		System.out.println("Byte value " + v);
	}
	
	public void proccess(Short v) {
		System.out.println("Short value " + v);
	}
	
	public void proccess(Object v) {
		System.out.println("Object value " + v);
	}
	
	public static void main(String[] args) {
		
		byte x = 12;
		short y = 13;
		new Test().proccess(x+y);	//	line1
		
		//	查找順序 --> int / long / float / double / Integer / Object
	}

}
/*
What is the output?
輸出結果是什麼？

A. The compilation fails due to an error in line 1
   編譯失敗，因為在第1行有錯誤
B. Short value 25
   短整型數值 25
C. Object value 25
   對象數值 25
D. Byte value 25
   字節數值 25
*/
