package p18;

public class Exam {
	
	public static void main(String[] args) {
		
	String s1 = new String("ORACLE");
	String s2 = s1.intern();	//	intern就是代表將s1的字串放到一個共享區!
	String s3 = "ORACLE";	//	既然是指定的字串，會直接放入共享區，但是s2已經有放到共享區了，所以會跟s2共享同區
	
	
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s2 == s3);
	}
	
}

/*
What is the result?
結果是什麼？

A. false false true
B. false true false
C. false true true
D. true false false
*/
