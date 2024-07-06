package p28;

public class p28 {

}
	
//	public static void foo(Function<Integer, String> fun) { ... }	輸入一個Ineteger要回傳一個String

/*
Which two compile?
哪兩個可以編譯？

A. foo(Integer::toHexString)
B. foo((int n) -> Integer.toHexString(n))	//	不用轉成int
C. foo(n -> n + 1);	//	不可以回傳int或是Integer，要回傳String 
D. foo(int n -> Integer.toHexString(n))	//	是Interger不用int
E. foo(new ::toHexString)	//	語法不對
F. foo(toHexString)	//	語法不對
G. foo(n -> Integer.toHexString(n))
H. foo(n -> Integer::toHexString)	//	方法參考不用n->
*/
