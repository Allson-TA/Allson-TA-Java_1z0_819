package p75;

public class ExampleClass implements ExampleInterface {

	public static void main(String[] args) {
		
		ExampleInterface theInstance = new ExampleClass();

	}

}
//	因為interface都是final不可變動，所以++--都不行

/*
Which three statements cause a compiler error when inserted at line 1?
插入在第1行的哪三個語句會導致編譯錯誤？

A. int i = theInstance.three++;

B. int f = ExampleInterface.three;

C. int d = ExampleInterface.one;

D. int b = two;

E. int a = one++;

F. int c = three;

G. int e = ExampleInterface.two++;

H. int g = theInstance.one;

I. int h = theInstance.two;
*/

