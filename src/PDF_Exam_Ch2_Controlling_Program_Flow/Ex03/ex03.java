package PDF_Exam_Ch2_Controlling_Program_Flow.Ex03;

public class ex03 {

	public static void main(String[] args) {
		
		int i = 10;
		do {
			for(int j = i / 2; j> 0 ; j--) {
				System.out.println(j+"");
			}
			i=2;
		}while(i>0);
		
		}

	}

/*
What is the result?
結果是什麼？

A) 5 4 3 2 1
B) nothing
C) 5
D) 5 4 3 2 1 4 3 2 1 3 2 1 2 1 1
*/
