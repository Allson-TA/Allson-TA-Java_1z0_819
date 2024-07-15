package PDF_Exam_Ch4_Exception_Handling.Ex07;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		
		try {
			doA();
			doB();
		} catch(IOException e) {
			System.out.println("C");
			return;
		} finally {
			System.out.println("d");
		}
		System.out.println("f");

	}
	
	private static void doA() {
		System.out.println("a");
		
		if(false) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	private static void doB() throws FileNotFoundException {
		
		System.out.println("b");
		if(true) {
			throw new FileNotFoundException();
		}
	}
}
/*
What is the result?
結果是什麼？

A) The compilation fails.
編譯失敗。
B) adf
C) abd
D) abcd
E) abdf
*/
