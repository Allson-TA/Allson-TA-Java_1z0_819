package p111;

public class Main {
	
	public Main() {
		
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		Resource r = new Resource();
		r.owner = w1;
		new Thread(()->{w1.work(w2, r);}).start();
		new Thread(()->{w2.work(w1, r);}).start();
		
	}

}
/*
Which describes the fragment?
哪個描述是正確的？

A. It throws an IllegalMonitorStateException
   它會拋出 IllegalMonitorStateException

B. It is subject to livelock
   它容易發生活鎖

C. The code does not compile
   代碼無法編譯

D. It is subject to deadlock
   它容易發生死鎖
*/
