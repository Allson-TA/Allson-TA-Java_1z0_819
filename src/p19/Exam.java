package p19;

public class Exam {
	
	@FunctionalInterface
	interface InterfaceE {
	    public boolean equals(int i);	//	要變成Object才可以
	    int breed(int x);
	}
	
	@FunctionalInterface	//	只有一個抽象方法可以
	interface InterfaceB {
	    int GERM = 13;
	    public default int getGERM() { return get(); }
	    private int get() { return GERM; }	//	java可以給自己用的方法
	    public boolean equals(Object o);	//	Object正確
	    int breed(int x);	//	只要有一個抽象方法就可以
	}
	
	@FunctionalInterface	//	程式沒有抽象方法
	interface InterfaceA {
	    int GERM = 13;
	    public default int getGERM() { return GERM; }
	}
	
	@FunctionalInterface
	interface InterfaceD {
	    int breed(int x);
	}

	@FunctionalInterface
	interface InterfaceC {	//	不可以有兩個抽象方法
	    public boolean equals(Object o);
	    int breed(int x);
	    int calculate(int x, int y);
	}
}
/*
Which two interfaces are considered to be functional interfaces?
哪兩個介面被認為是功能性介面？

A.
@FunctionalInterface
interface InterfaceE {
    public boolean equals(int i);	//	要變成Object才可以
    int breed(int x);
}

B.
@FunctionalInterface
interface InterfaceB {
    int GERM = 13;
    public default int getGERM() { return get(); }
    private int get() { return GERM; }
    public boolean equals(Object o);
    int breed(int x);
}

C.
@FunctionalInterface
interface InterfaceA {
    int GERM = 13;
    public default int getGERM() { return GERM; }
}

D.
@FunctionalInterface
interface InterfaceD {
    int breed(int x);
}

E.
@FunctionalInterface
interface InterfaceC {
    public boolean equals(Object o);
    int breed(int x);
    int calculate(int x, int y);
}
*/
