package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex10;

import java.util.Collection;
import java.util.List;

public class Bar extends Foo {
	
	public void foo(Collection arg) {
		System.out.println("Hello world");
	}
	
	public void foo(List arg) {
		System.out.println("Hello Mumdol!");
	}
	

}
