package p02;

import java.util.List;
import java.util.function.Consumer;

public class p02 {
	public static void main(String[] args) {
	
	Consumer<String> function = (String f) -> { System.out.println(f); };
	//	Consumer<String> function = f -> { System.out.println(f); };
	// 	Consumer<String> function1 = f -> System.out.println(f);
	//	Consumer<String> function = System.out::print;
	//	var 會自動推斷型別 | List.of 稱為不可變集合
	var fruits = List.of("apple","orange","banana","lemon");
	fruits.forEach(function);

	}
}

/*
Which statement on line 1 enables this code to compile?
哪個語句在第 1 行能夠讓這段程式碼編譯成功？

A. Predicate<String> function = a -> a.equals("banana");	//	回傳boolean值
B. Function<String, String> function = x -> x.substring(1, 2);	//	計算一個引數，該引數計算完成後回傳結果
C. Consumer<String> function = (String f) -> { System.out.println(f); };	
D. Supplier<String> function = () -> fruits.get(0);	//	不接受任何引數只回傳值
*/

