package p46;

public class Person {
	
	private String name = "Green";
	public void setName(String name) {
		String title = "Mr.";
		this.name = title + name;
	}

	public String toString() {
		return name;
	}

}

/*
What is the result?
結果是什麼？

A. An exception is thrown at runtime.
   執行期間拋出異常。

B. Green

C. Mr. Green

D. Mr. Blue
*/