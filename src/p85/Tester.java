package p85;

public class Tester {
	
	public static Person createPerson() {
		Person jane = new Person("Jane");
		Person john = new Person("John",jane);
		return jane;
	}

	public static Person createPerson(Person person) {
		person = new Person("Jack",person);
		return person;
	}
	
	public static void main(String[] args) {
		
		Person person = createPerson();
		//	line1
		
		person = createPerson(person);
		//	line2
		
		String name = person.toString();
		System.out.println(name);
	}
}
/*
Which statement is fails?
哪個敘述是錯的？

A. The memory allocated for Jack object can be reused in line 2.
   為 Jack 物件分配的記憶體可以在第2行重新使用。

B. The memory allocated for John object can be reused in line 1.
   為 John 物件分配的記憶體可以在第1行重新使用。

C. The memory allocated for Jane object can be reused in line 2.
   為 Jane 物件分配的記憶體可以在第2行重新使用。

D. The memory allocated for Jane object can be reused in line 1.
   為 Jane 物件分配的記憶體可以在第1行重新使用。
*/
