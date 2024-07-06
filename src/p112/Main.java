package p112;

public class Main {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new MyThread());
		Thread t2 = new Thread(new MyThread());
		Thread t3 = new Thread(new MyThread());
	
		t1.start();
		t2.run();
		t3.start();
		
		t1.start();
	}
}
/*
Which one is correct?
哪一個是正確的？

A. Three threads are created
   建立了三個執行緒

B. An IllegalThreadStateException is thrown at runtime
   執行時會拋出 IllegalThreadStateException

C. The compilation fails
   編譯失敗

D. Four threads are created
   建立了四個執行緒
*/
