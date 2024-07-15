package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex03;

public class Avatar extends GameObject{

	public Object[] move(Number x,Number y) {
		System.out.println("Move Character");
		return super.move(x.intValue(), y.intValue());
	}
	
	public static void main(String... args) {
		
		var charater = new Avatar();
		charater.move(10.0, 10.0);
		charater.move(10, 10);
		
	}

}

/*
What is the result? 結果是什麼？

A) 
Move Character
Move GameObject
Move GameObject

B) 
Move GameObject
Move GameObject

C) 
Move GameObject
Move Character
Move GameObject

D) 
Move GameObject
*/
