package p09;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>( 
			List.of("Earth","Wind","Fire")	//	不可修改集合，但是套用到上面一般List變成可修改集合
		);
		List<String> list2 = List.copyOf(list1);	//	不可變集合
		
		list1.sort((String item1 , String item2) -> item1.compareTo(item2));	//	可修改集合-->可以排序
		list2.sort((String item1 , String item2) -> item1.compareTo(item2));	//	不可修改集合-->不可以排序
		
		System.out.println(list2.equals(list1));	
	}
}

/*
What is the result?
結果是什麼？

A. A java.lang.UnsupportedOperationException is thrown
   拋出 java.lang.UnsupportedOperationException

B. false
   假

C. true
   真

D. A java.lang.NullPointerException is thrown
   拋出 java.lang.NullPointerException

結構不可變(structurally immutable)
只要新增修改刪除，set更改list結構的方法則會拋出UnsupportedOperationException錯誤。不過list中的元素的內容仍是可變的。
傳入的元素不允許null。若傳入的參數為null則拋出NullPointerExcception。

*/
