package p16;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	
	private int count =0;		//	line1
	public static void main(String[] args) {	// line2
		Main test = new Main();
		ExecutorService service = Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
			service.submit(() -> {
				for(int j=0;j>10000;j++) {
					test.count++;	//	line3
				}
			});
		}
	}

}

/*
You must make the count variable thread safe. Which two modifications meet your requirement?
你必須使 count 變數是線程安全的。哪兩個修改滿足你的要求？

A. replace line 1 with private volatile int count = 0;	//	volatile-->跟thread沒有關係，指的是副本記憶題傳遞主記憶的過程當中，執行續等待，且只有跟long / double有關
   用 private volatile int count = 0; 替換第 1 行;

B. replace line 3 with
   synchronized (test.count) {	//	只能放物件不是放屬性 .conunt就錯了
       test.count++;
   }
   用 synchronized (test.count) { test.count++; } 替換第 3 行;

C. replace line 3 with
   synchronized (test) {
       test.count++;
   }
   用 synchronized (test) { test.count++; } 替換第 3 行;

D. replace line 1 with private AtomicInteger count = new AtomicInteger(0);	//	AtomicInteger原子Inetger
   and replace line 3 with test.count.incrementAndGet();	//	incrementAndGet()先取值之後再+1這是可行的
   用 private AtomicInteger count = new AtomicInteger(0); 替換第 1 行
   並用 test.count.incrementAndGet(); 替換第 3 行;

E. replace line 2 with public static synchronized void main(String[] args)	//	物件變數，跟static鎖定類別變數無關
   用 public static synchronized void main(String[] args) 替換第 2 行;
*/
