package PDF_Exam_Ch4_Exception_Handling.Ex04;

import java.io.FileReader;
import java.io.IOException;

public class ex04 {
	
	public static void main(String[] args) {
		
		char[] characters = new char[100];
		try (FileReader reader = new FileReader("file_to_path");){
			//	line1
			System.out.println(String.valueOf(characters));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
You want to read data through the reader object.
你想通過reader對象讀取數據。

Which statement inserted on line 1 will accomplish this?
在第1行插入哪條語句將完成此操作？

A) reader.readLine();
B) characters=reader.read();
C) reader.read(characters);
D) characters.read();
*/
