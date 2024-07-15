package PDF_Exam_Ch6_Working_With_Streams_And_Lambda.Ex04;

import java.util.List;
import java.util.Optional;

public class ex04 {
	
	public static void main(String[] args) {
		
		var fruits = List.of("apple","orange","banana","lemon");
		Optional<String> result = fruits.stream().filter(f->f.contains("n")),findAny;//line1
		
		System.out.println(result.get());
	}

}
/*
You replace the code on line 1 to use parallelStream. 你將第1行的程式碼替換為使用 parallelStream。

Which one is correct? 哪一個是正確的？

A) The compilation fails.  編譯失敗。
B) The code will produce the same result.  代碼將產生相同的結果。
C) A NoSuchElementException is thrown at runtime.  在運行時拋出 NoSuchElementException。
D) The code may produce a different result.  代碼可能會產生不同的結果。
*/

