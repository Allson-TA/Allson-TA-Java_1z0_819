package p106;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Bar extends Foo {

	public void foo(Collection arg) {
		System.out.println("Hello world");
	}
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		Bar b = new Bar();
		Foo f = b;
		b.foo(li);
		f.foo(li);
		
	}
}
/*
What is the output?
輸出結果是什麼？

A. Hello world
   Bonjour le monde
B. Bonjour le monde
   Bonjour le monde
C. Bonjour le monde
   Hello world
D. Hello world
   Hello world
*/
