package PDF_Exam_Ch1_Working_With_Java_Data_Types.Ex04;

public class Tester {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(5);
		sb.append("HOWDY");
		sb.insert(0," ");
		sb.replace(3, 5, "LL");
		sb.insert(6,"COW");
		sb.delete(2, 7);
		System.out.println(sb.length());
		
	}

}

/*
What is the result?  結果是什麼？
A. 5
B. 3
C. An exception is thrown at runtime.  執行時拋出異常
D. 4
*/
