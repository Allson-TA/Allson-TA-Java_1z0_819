package p49;

public class Tester {

	public static void main(String[] args) {
		
		Person p = new Person("Joe");
		checkPerson(p);
		System.out.println(p);	
		p = null;
		System.out.println(p);
	}
	
	public static Person checkPerson(Person p) {
		if(p == null) {
			p = new Person("Mary");
		} else {
			p = null;
		} 
		return p;
	}
	
}

/*
What is the result?
結果是什麼？

A. Joe
   Marry

B. null
   null

C. Joe
   null

D. null
   Mary
*/

