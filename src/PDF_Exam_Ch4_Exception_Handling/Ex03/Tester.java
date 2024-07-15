package PDF_Exam_Ch4_Exception_Handling.Ex03;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Tester {

	public static void main(String[] args) {
		
		try {
			doA();
		}	//	line1
	}
	
	private static void doA() throws Exception,IndexOutOfBoundsException{
		if(false) {
			throw new FileNotFoundException();
		} else {
			throw new IndexOutOfBoundsException();
		}
	}
}
/*
What must be added in line 1 to compile this class?
在第 1 行中必須添加什麼才能編譯這個類？
A) catch(FileNotFoundException | Exception e){}
B) catch(FileNotFoundException e){}
   catch(IndexOutOfBoundsException e){}
C) catch(Exception e){}
D) catch(IndexOutOfBoundsException e){}
   catch(FileNotFoundException e){}
E) catch(FileNotFoundException | IndexOutOfBoundsException e){}
*/
