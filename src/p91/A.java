package p91;

public class A {

	int a = 0 ;
	int b = 0 ;
	int c = 0 ;
	
	public void foo(int i) {
		a += b * 1 ;
		c -= b * i ;
	}
	
	public void setB(int i) {
		b = i;
	}
	
}

/* 
Which make class A thread safe?
哪種方式使類別 A 成為線程安全的？
A. Make setB synchronized
   將 setB 方法設為 synchronized
B. Make foo synchronized
   將 foo 方法設為 synchronized
C. Class A is thread safe
   類別 A 是線程安全的
D. Make foo and setB synchronized
   將 foo 和 setB 方法都設為 synchronized
E. Make A synchronized
   將 A 類設為 synchronized
*/
