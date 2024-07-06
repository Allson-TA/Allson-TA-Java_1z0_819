package p04;
	
	class MyThread implements Runnable {
		public void run() {
			//	System.out.println("Running.");
			System.out.println("Running." + Thread.currentThread().getName());
		}
	}
	
	public class Main {
		public static void main(String[] args) {
			Thread t1 = new Thread(new MyThread());
			Thread t2 = new Thread(new MyThread());
			Thread t3 = new Thread(new MyThread());
			t1.start();
			t2.run();	//	違反執行緒原則，但還是一樣可以強制透過主程式執行
			t3.start();
			t1.start();	//	t1已經start過，不可重複start
		}
	}

/*
Which one is correct?
哪一個是正確的？

A. An IllegalThreadStateException is thrown at run time.
   執行時拋出 IllegalThreadStateException。

B. Four threads are created.
   建立了四個執行緒。

C. Three threads are created.
   建立了三個執行緒。

D. The compilation fails.
   編譯失敗。
*/


