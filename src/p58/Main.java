package p58;

import java.util.List;
import java.util.Optional;

public class Main {
	public static void main(String[] args) {
		
		var numbers = List.of(1,2,3,4,5,6,7,8,9,10);
		Optional<Integer> result = numbers.stream().filter(x->x%3!=0).reduce((i,j)->i+j);
		result.ifPresent(System.out::print);	//	line1
	}
}
/*
Which is true about line 1?
關於第 1 行，哪一個說法是正確的？

A. If the value is not present, a NoSuchElementException is thrown at run time.
   如果值不存在，則在運行時會拋出 NoSuchElementException。

B. It always executes the System.out::print statement.
   它總是執行 System.out::print 語句。

C. If the value is not present, a NullPointerException is thrown at run time.
   如果值不存在，則在運行時會拋出 NullPointerException。

D. If the value is not present, nothing is done.
   如果值不存在，則不執行任何操作。


這道題不是在說 List.of() 返回一個空列表的情況，而是在說經過過濾操作後，若沒有任何元素通過過濾條件，
導致 reduce 操作返回空的 Optional

*/