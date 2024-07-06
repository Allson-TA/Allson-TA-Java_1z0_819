package p108;

public class App {
	//	line1
	public static void main(String[] args) {
		new App().new Greeting().greet("Joe");
	}
	
}
/*
Which code fragment added to line 1 enables the code to compile and print Hello Joe ?
哪個代碼片段添加到第1行可以使代碼編譯並打印Hello Joe？

A. class Greeting {
       private void greet(String name) {
           System.out.println("Hello " + name);
       }
   }

B. class Greeting {
       public static void greet(String name) {	//	內部類別不可能static
           System.out.println("Hello " + name);
       }
   }

C. interface Greeting {		//	不能直接NEW
       public default void greet(String name) {
           System.out.println("Hello " + name);
       }
   }

D. static class Greeting {	//	內部類別不可能static
       public void greet(String name) {
           System.out.println("Hello " + name);
       }
   }
*/
