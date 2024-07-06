package p47;

import java.util.List;

public class p47 {

	public static void main(String[] args) {
		
		List<Integer> a = List.of(113,110);
		List<Integer> b = List.of(112,111);
		
		//	Line1
		
	}

}

/*
You want to print the result as 110 111 112 113.
Which statement on line 1 will accomplish this?

你想要將結果印出為110 111 112 113。
哪一個語句插入在第1行可以達成這個目的？

A. Stream.of(a, b).map(c -> c.stream()).sorted().forEach(i -> System.out.print(i + " "));

B. Stream.of(a, b).flatMap(c -> c.stream()).sorted().forEach(i -> System.out.print(i + " "));

C. Stream.of(a, b).flatMap(c -> c.stream()).sorted().forEach(i -> System.out.print(i + " "));

D. Stream.concat(a, b).sorted().forEach(i -> System.out.print(i + " "));	//	要改成a.stream , b.stream
*/
