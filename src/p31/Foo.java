package p31;

import java.util.*;

class Foo {
	
	public List<Integer> foo(Set<CharSequence>m){
		return null;
	}
	
}

class Bar extends Foo{
	//	public ArrayList<Number> foo(Set<CharSequence> m) { return null ;}
	//	public ArrayList<Integer> foo(Set<String> m) { return null ;}
	public List<Integer> foo(TreeSet<String> m) { return null ;}
	//public List<Object> foo(Set<CharSequence> m) { return null ;}
	public List<Integer> foo(Set<CharSequence> m) { return null ;}
	//	public List<Number> foo(Set<String> m) { return null ;}
}

/*
Which two method definitions at line n1 in the Bar class compile?
Bar 類中 n1 行的哪兩個方法定義可以編譯？

A. public ArrayList<Number> foo(Set<CharSequence> m) { ... }	//	Number應改成Integer，範型，除非多型轉
B. public ArrayList<Integer> foo(Set<String> m) { ... }			//	String應該也要是CharSequence
C. public List<Integer> foo(TreeSet<String> m) { ... }			//	複寫 : TreeSet是Set的子類所以可以複寫 V	
D. public List<Object> foo(Set<CharSequence> m) { ... }			//	Number應改成Integer範型
E. public List<Integer> foo(Set<CharSequence> m) { ... }		//	V
F. public List<Number> foo(Set<String> m) { ... }				//	Number應改成Integer，範型
*/
