package PDF_Exam_Ch4_Exception_Handling.Ex06;

import java.util.Optional;

public class Option {
	
	public static void main(String[] args) {
		
		System.out.println("Ans:" + convert("a").get());
		
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

A) Ans:

B) Ans: a

C) A java.util.NoSuchFilementException is thrown at run time
執行時拋出java.util.NoSuchFilementException

D) The compilation fails
編譯失敗
*/
