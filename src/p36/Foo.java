package p36;

public class Foo {
	
	public static String ALPHA = "alpha";
	protected String beta = "beta";
	private final String delta;
	public Foo(String d) {
		delta = ALPHA +d;
	}
	
	public String foo() {
		return beta += delta;
	}

}

/*
Which change would make Foo more secure?
哪种更改会使 Foo 更加安全？

A. public static final String ALPHA = "alpha";
   公共静态常量字符串 ALPHA = "alpha";
   
B. protected final String beta = "beta";
   受保护的常量字符串 beta = "beta";
   
C. public String beta = "beta";
   公共字符串 beta = "beta";
   
D. private String delta;
   私有字符串 delta;
*/
