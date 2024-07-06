package p85;

public class Person {

	private String name;
	private Person child;
	
	public Person(String name, Person child) {
		super();
		this.name = name;
		this.child = child;
	}

	public Person(String name) {
		this.name = name;
	}
	

	public String toString() {
		return name +" " + child;
	}
	
	
	
}
