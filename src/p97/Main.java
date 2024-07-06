package p97;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<String> fruits = List.of("banana","orange","apple","lemon");
		Stream<String> s1 = fruits.stream();	//	串流	
		Stream<String> s2 = s1.peek(i -> System.out.print(i +" "));	//	中間流，
		System.out.println("-----");
		Stream<String> s3 = s2.sorted();	//	由小到大排序
		Stream<String> s4 = s3.peek(i->System.out.print(i+" "));
		System.out.println("-----");
		String strFruits = s4.collect(Collectors.joining(","));
	}

}
/*
What is the output?
輸出是什麼？

A.
-----
-----
banana orange apple lemon apple banana lemon orange

B.
-----
-----

C.
banana orange apple lemon
-----
apple banana lemon orange
-----

D.
-----
banana orange apple lemon
-----
apple banana lemon orange

E.
banana orange apple lemon apple banana lemon orange
-----
-----
*/
