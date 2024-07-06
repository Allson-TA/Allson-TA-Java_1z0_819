package p121;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String... args) {
		
		var list = new ArrayList(List.of("Coffee","Cappuccino","Latte"));
		list.forEach((item)->{
			list.remove(item);
		});
		System.out.println(list);
	}

}
/*
What is the result?
結果是什麼？

A. A java.lang.NullPointerException is thrown.
   拋出 java.lang.NullPointerException。

B. [Coffee, Cappucino, latte]
   [Coffee, Cappucino, latte]

C. A java.util.ConcurrentModificationException is thrown.
   拋出 java.util.ConcurrentModificationException。

D. It prints null.
   印出 null。

E. It prints [].
   印出 []。
*/
