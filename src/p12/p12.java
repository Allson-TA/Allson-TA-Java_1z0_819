package p12;

import java.util.List;

public class p12 {

	List<Integer> list = List.of(11,12,13,12,13);
	
	
}

/*
Which statement causes a compile time error?
哪個語句會導致編譯時錯誤？

A. Double e = Double.valueOf(list.get(0));	//	autoboxing: Interger -> int ，但是因為Double.valueOf裡面是double值 所以會再轉到 -> double
B. Double d = list.get(0);	//	不可以轉成 Double 物件，小寫就可以 (晉升)
C. double f = list.get(0);
D. int c = list.get(0);
E. Integer b = list.get(0);
F. Integer a = Integer.valueOf(list.get(0));
*/

