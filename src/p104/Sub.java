package p104;

public class Sub extends Super {
	
	int num;	//	line2
	Sub(short num) {	//	line3
		super(num);
	}
	
	protected void method() {	//	line4
		System.out.println("Output from Sub");
	}
	
}
/*
Which line of code results in a compilation error?
哪行代碼導致編譯錯誤？

A. line 3
B. line 4
C. line 1
D. line 2
*/
