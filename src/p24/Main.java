package p24;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> list = new CopyOnWriteArrayList<>();
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		CyclicBarrier barrier = new CyclicBarrier(2,() -> System.out.println(list));	//	2就是跑兩次的意思，後面要印出一個結果，兩個兩個一組
		
		IntStream.range(0, 5).forEach(n->{	//	因為兩個兩個一組，然後會多一個執行續空在那裏等待
			try {
				list.add(n);
				System.out.println(list);
				barrier.await();	//	剩下一條執行緒等待
			} catch (InterruptedException | BrokenBarrierException e) {
				System.out.println("Exception");
			}
		});
		//	一樣可以執行，但是會卡在烙單的那條執行續，程式永遠不會結束
		executorService.shutdown();
	}
	
}

/*
Which statement is true?
哪個陳述是正確的？

A. The action of CyclicBarrier is called five times.	//	因為兩個兩個一組，所以/2剩餘1
   CyclicBarrier 的操作被調用了五次。

B. It never finishes.
   它從未完成。

C. Threads in executorService execute for each of the two threads.
   executorService 中的線程對每個線程執行。

D. It finishes without any exception.
   它完成時沒有任何異常。
*/

