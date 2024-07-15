package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex03;

public class GameObject {
	
	public Object[] move(int x, int y) {
		System.out.println("Move GameObject");
		return new Integer[] {x+10,y+10};
		
	}

}
