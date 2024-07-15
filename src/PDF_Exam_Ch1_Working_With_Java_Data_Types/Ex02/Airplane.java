package PDF_Exam_Ch1_Working_With_Java_Data_Types.Ex02;

public class Airplane {

	static int start = 2;
	final int end;
	
	public Airplane(int x) {
		x = 4;
		end =x;
	}
	
	public void fly(int distance) {
		
		System.out.println(end-start+"");
		System.out.println(distance);
	}
	
}
