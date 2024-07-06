package p100;

import java.util.ArrayList;
import java.util.Arrays;

public class NewMain {

	public static void main(String[] args) {
		
		String[] catNames = {"abyssinian","oxicat","korat","laperm","bengal","sphynx"};
		var cats = new ArrayList<>(Arrays.asList(catNames));
		cats.sort((var a , var b) -> -a.compareTo(b));
		cats.forEach(System.out::println);
	}
}
/*
What is the result?
結果是什麼？

A. abyssinian
   bengal
   korat
   laperm
   oxicat
   sphynx

B. sphynx
   oxicat
   laperm
   korat
   bengal
   abyssinian

C. nothing
沒有結果

D. abyssinian
   oxicat
   korat
   laperm
   bengal
   sphynx
*/
