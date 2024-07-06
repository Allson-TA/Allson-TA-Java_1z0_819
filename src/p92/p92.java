package p92;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class p92 {

	public static void main(String[] args) throws InterruptedException {

		var c  = new CopyOnWriteArrayList<>(List.of("1","2","3","4"));
		
		Runnable r = () -> {
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			c.set(3, "four");
			System.out.println(c +" ");
		};
		
		Thread t = new Thread(r);
		t.start();
		for(var s:c) {
			System.out.println(s + " ");
			Thread.sleep(100);
		}
	}
}
/*
What is the result?
結果是什麼？

A. 1 2 [1, 2, 3, 4] 3 four
B. 1 2 [1, 2, 3, four] 3 four
C. 1 2 [1, 2, 3, four] 3 4
D. 1 2 [1, 2, 3, 4] 3 4
*/
