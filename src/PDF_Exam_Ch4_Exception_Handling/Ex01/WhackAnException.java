package PDF_Exam_Ch4_Exception_Handling.Ex01;

import javax.management.RuntimeErrorException;

public class WhackAnException {

	public static void main(String...hammer) {
		
		try {
			throw new ClassCastException();
		} catch (IllegalArgumentException e) {
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			throw new NullPointerException();
		} finally {
			throw new RuntimeException();
		}
		
	}
	
}

/* 
Given the following application, which specific type of exception will be printed in the stack trace at runtime?
假設以下應用程序，運行時堆棧跟蹤中將打印哪種類型的異常？
A. ClassCastException
B. IllegalArgumentException
C. NullPointerException
D. RuntimeException
E. The code does not compile.
F. None of the above
*/
