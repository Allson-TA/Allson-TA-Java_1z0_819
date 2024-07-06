package p109;

public class DoClass {

	static String s;
	
	public static void main(String[] args) {
		
		switch (s) {
		case "41":s+="41";
		default:s +="def";
		case "42":s+="42";
		}
		System.out.println(s);

	}

}
//	因為初始值是null
/*
What is the output?
輸出結果是什麼？

A. An exception is thrown at runtime
   運行時拋出異常

B. 41 def 42

C. null

D. def 42
*/
