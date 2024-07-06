package p42;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

	public static void main(String[] args) {
		//	line5
		//	因為 System.in是InputStream
		//	InputStream不可以直接給Reader
		//	Reader --> 字元導向 | bye char
		//	InputStream --> 位元導向 | byr byte
		//	必須透過InputStreamReader 將 InputStream(byte) 轉 Reader(char)
		try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
		System.out.println("input:");
		String input = in.readLine();
		System.out.println("Echo:"+input);
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
}

/**
You must read the data from the Standard Input console.
你必須從標準輸入控制台讀取數據。

Which code inserted at line 5 meets your requirement?
在第 5 行插入哪段代碼符合你的需求？

A. try(BufferedReader in = new BufferedReader(new InputStreamReader(System.in))) {
B. try { BufferedReader in = System.in; 
C. try(BufferedReader in = new BufferedReader(new Reader(System.in))) { 
D. try(BufferedReader in = new BufferedReader(System.in)) { 
*/


