package PDF_Exam_Ch4_Exception_Handling.Ex05;

import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		

	try {
		String param1 = "oracle";
		if(param1.equalsIgnoreCase("oracle")) {
			throw new ExSub(9001, "APPLICATION　ERROR-9001", new FileNotFoundException("MyFile.txt"));
		}
			throw new ExSuper(9001, new FileNotFoundException("MyFile.txt"));
			//	line1
		
	} catch(ExSuper ex) {
		System.out.println(ex.getMessage());
	}
	}
}
/*
What is the result?
結果是什麼？

A) Compilations fails at Line 1;
編譯在第1行失敗；

B) 9001: java.io.FileNotFoundException: MyFile.txt-MyFile.txt

C) 9001: APPLICATION ERROR-9001-MyFile.txt

D) 9001: APPLICATION ERROR-9001-MyFile.txt
   9001: java.io.FileNotFoundException: MyFile.txt-MyFile.txt
*/


