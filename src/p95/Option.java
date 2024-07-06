package p95;

import java.util.Optional;

public class Option {

	public static void main(String[] args) {
		
		System.out.println("Ans :" + convert("a").get());
		
	}

	private static Optional<Integer> convert(String s) {
		try {
			return Optional.of(Integer.parseInt(s));
		} catch (Exception e) {
			return Optional.empty();
		}
		
	}
	
}
/*
What is the result?
結果是什麼？

A. The compilation fails
   編譯失敗
B. Ans :
C. Ans : a
D. A java.util.NoSuchElementException is thrown at run time
   運行時拋出 java.util.NoSuchElementException 異常
*/
