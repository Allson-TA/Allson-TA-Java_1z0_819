package p05;

import java.util.Comparator;

public class p05 {
	
	public static void main(String[] args) {
		
	Comparator<String> c1 = (j, k) -> 0;
	Comparator<String> c2 = (String j, String k) -> 0;
	//Comparator<String> c3 = (var j, String k) -> 0;	//	不能一個var配上其他型態，沒辦法比對
	//Comparator<String> c4 = (var j, k) -> 0;		//	只能像c5這樣呼叫
	Comparator<String> c5 = (var j, var k) -> 0;
}
	/*
	How many of these compile?
	這些中有多少能編譯成功？
	A. 0
	B. 1
	C. 2
	D. 3
	E. 4
	F. 5
	*/

}
