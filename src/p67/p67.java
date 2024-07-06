package p67;

public class p67 {
	
	public static void main(String[] args) {
		
		String s1 = new String("Java");
		String s2 = s1.intern();
		StringBuilder sb1 = new StringBuilder("Java");
		String s3 = sb1.toString();
		System.out.println(s1==s2);
		System.out.println(s1.equals(sb1.toString()));
		System.out.println(s2==s3);
		
	}

}
/*
What is the result?
結果是什麼？

A. false
   true
   true

B. false
   false
   false

C. true
   false
   true

D. false
   true
   false
*/
