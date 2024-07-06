package p33;

import java.util.List;
import java.util.Optional;

public class Test{
	public static void main(String[] args) {
		var items = List.of(new Item("A",10),new Item("B", 2),new Item("C", 12),
				new Item("D", 5),new Item("E", 6));
		
		double avg = items.stream().mapToInt(i->i.amount).average().orElse(0.0);
		Optional<Item> item = items.parallelStream().filter(i->i.amount < avg).findAny();
		System.out.println(item.orElseThrow());
	}
}

/*
Which is true?
哪一個是正確的？

A. This should print the same result each time the program runs.	//	如果沒有parallelStream()->單工-->所以答案都會一樣
   每次運行程式時都應該打印相同的結果。
   
B. The compilation fails.
   編譯失敗。
   
C. This may not print the same result each time the program runs.	//	因為有parallelStream()->多工-->所以答案不一定 V
   這可能不會每次運行程式時都打印相同的結果。
   
D. A NoSuchElementException is thrown at run time.
   運行時會拋出 NoSuchElementException。
*/
