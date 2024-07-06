package p01;

interface A {
	abstract void x();
	public default void y() {
	}
}

abstract class B {
	public abstract void z();
}


public class C extends B implements A {

	@Override
	public void x() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void z() {
		// TODO Auto-generated method stub
		
	}
	
}

/*
What code inserted into class C would allow it to compile?
插入到類別 C 的哪段程式碼可以讓它編譯成功？

A. void x() { super.y(); }	--> super指的是繼承的B，但B裡面沒有y方法
   public void z() {}

B. public void x() {}
   public void z() {}
   //	Bingo

C. void x() {}	--> public void x() {} 要加上public才對
   public void z() {}

D. public void x() {}
   protected void y() { super.y(); }	--> super指的是繼承的B，但B裡面沒有y方法，即便B裡面有y方法，權限不可以小於public
   public void z() {}

E. void x() {}	--> public void x() {} 要加上public才對
   public void y() {}
   public void z() {}
*/
