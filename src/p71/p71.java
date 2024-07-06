package p71;

import java.util.stream.IntStream;

public class p71 {

	public static void main(String[] args) {
		IntStream.range(1,4).peek(i->{if(i==3)throw new RuntimeException("Exception thrown");
			//	Peek中間沒有引流，forEach等等的，Peek不會執行
		});
	}
}

/*
What is the result?
結果是什麼？

A. The program prints: 123 and the RuntimeException is thrown.
   程式列印出：123 並且拋出 RuntimeException。

B. The program prints nothing.
   程式不會印出任何東西。

C. The program prints: 12 and the RuntimeException is thrown.
   程式列印出：12 並且拋出 RuntimeException。

D. The program prints: 1234 and a java.lang.IllegalStateException is thrown.
   程式列印出：1234 並且拋出 java.lang.IllegalStateException。
*/
