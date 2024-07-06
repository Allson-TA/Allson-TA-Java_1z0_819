package p96;

import java.io.FileReader;
import java.io.IOException;

public class p96 {

	public static void main(String[] args) {
		char[] charactres = new char[100];
		
		try (FileReader reader = new FileReader("file_to_path")){
			//	line1
			System.out.println(String.valueOf(charactres));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
/*
You want to read data through the reader object.
Which statement inserted on line 1 will accomplish this?
你想通過 reader 對象讀取數據。
插入到第 1 行的哪個語句能夠實現這一點？

A. reader.read(characters);
B. characters.read();
C. reader.readLine();
D. characters = reader.read();
*/
