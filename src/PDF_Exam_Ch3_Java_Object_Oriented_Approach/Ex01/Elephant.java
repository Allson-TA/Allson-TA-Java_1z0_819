package PDF_Exam_Ch3_Java_Object_Oriented_Approach.Ex01;

interface Long{
	Number length();
}

public class Elephant {

	public class Trunk implements Long{
		public Number length() {
			return 6 ;	//	k1
		}
	}
	
	public class MyTrunk extends Trunk{	//	k2
		public Integer length() {
			return 9; //	k3
		}
	}
	
	public static void charage() {
		System.out.println(new MyTrunk().length());
	}
	
	public static void main(String[] args) {
		new Elephant().charage();	//	k4
	}
}
/* 
Which statement about the Elephant program is correct? 象程序的哪條語句是正確的？
A. It compiles and prints 6.
B. The code does not compile because of line k1.
C. The code does not compile because of line k2.
D. The code does not compile because of line k3.
E. The code does not compile because of line k4.
F. None of the above
*/
