package p66;

public class p66 {
	
	public static void main(String[] args) {
		
		StringBuilder s = new StringBuilder("ABCD");
		//	System.out.println(s.replace(1, 2, "Q"));
		System.out.println(s.replace(s.indexOf("B"), s.indexOf("C"), "Q"));	//	取得字串位置 replace是小於的意思，所以是1<2
		
	}
	
	/*
	Which would cause s to be AQCD ?
	哪個會讓 s 變成 AQCD？

	A. s.replace(s.indexOf("B"), s.indexOf("C"), "Q")

	B. s.replace(s.indexOf("A"), s.indexOf("C"), "Q")

	C. s.replace(s.indexOf("A"), s.indexOf("B"), "Q")

	D. s.replace(s.indexOf("B"), s.indexOf("B"), "Q")
	*/

}
