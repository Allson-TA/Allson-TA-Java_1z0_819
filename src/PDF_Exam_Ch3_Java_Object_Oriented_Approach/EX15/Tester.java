package PDF_Exam_Ch3_Java_Object_Oriented_Approach.EX15;

public class Tester {

	public static Person createPeople() {
		Person jane = new Person("Jane");
		Person john = new Person("John" , jane);
		return jane;
	}
	
	public static Person createPerson(Person person) {
		person = new Person("Jack",person);
		return person;
	}
	
	public static void main(String[] args) {
		Person person = createPeople();
		//	line1
		person = createPerson(person);
		//	line2
		
		String name = person.toString();
		System.out.println(name);
	}
}

/*
Which statement is true?
哪個說法是正確的？

A) The memory allocated for John object can be reused in line 1.
John 對象分配的內存可以在第1行中重用。

B) The memory allocated for Jack object can be reused in line 2.
Jack 對象分配的內存可以在第2行中重用。

C) The memory allocated for Jane object can be reused in line 2.
Jane 對象分配的內存可以在第2行中重用。

D) The memory allocated for Jane object can be reused in line 1.
Jane 對象分配的內存可以在第1行中重用。
*/
