package PDF_Exam_Ch1_Working_With_Java_Data_Types.Ex06;

public class Test {

	public void process(byte v) {
		System.out.println("Byte value"+v);
	}
	
	public void process(short v) {
		System.out.println("short value"+v);
	}
	
	public void process(Object v) {
		System.out.println("Object value"+v);
	}
	
	public static void main(String[] args) {
		
		byte x = 12;
		short y = 13;
		new Test().process(x + y);

	}
}

/*
What is the output?  輸出是什麼？
A) Object value 25
B) Byte value 25
C) Short value 25
D) The compilation fails due to an error in line 1  編譯因第1行的錯誤而失敗
*/
