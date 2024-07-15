package PDF_Exam_Ch3_Java_Object_Oriented_Approach.EX15;

public class Person {
	
	private String name;
	private Person child;
	public Person(String name,Person child) {
		
		this(name);
		this.child = child;
		
	}
	
	public Person(String name) {
		this.name=name;
	}
	
	public String toString() {
		return name +""+child;
	}
	
}
