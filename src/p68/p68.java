package p68;

import java.util.stream.IntStream;

public class p68 {
	
	public static void main(String[] args) {
		var i = 1;
		var result = IntStream.generate(() -> { return i; })
		                      .limit(100).sum();
		System.out.println(result);
		
		
		System.out.println(IntStream.range(0, 99).count());	//	for迴圈跑幾次 0到98
		System.out.println(IntStream.range(1, 100).count());	//1~99
		System.out.println(IntStream.rangeClosed(0, 100).map(x -> x).count());	//	rangeClosed 從0開始算	所以是101
		System.out.println(IntStream.rangeClosed(1, 100).count());
	}
}

/*
Which statement prints the same value of result ?
哪個語句打印出相同的result值？

A. System.out.println(IntStream.range(0, 99).count());
B. System.out.println(IntStream.range(1, 100).count());
C. System.out.println(IntStream.rangeClosed(0, 100).map(x -> x).count());
D. System.out.println(IntStream.rangeClosed(1, 100).count());
*/
