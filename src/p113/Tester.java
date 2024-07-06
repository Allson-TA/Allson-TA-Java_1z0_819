package p113;

public class Tester {

	public static void main(String[] args) {
		
		int x = 0,y =6;
		for(; x<y;x++,y--) {	//	line1
			if(x%2==0) {
				continue;
			}
			System.out.println(x+"-"+y);
		}

	}

}
/*
What is the result?
結果是什麼？

A. 0-6
   2-4

B. The compilation fails due to an error in line 1
   因第1行的錯誤導致編譯失敗

C. 0-6

D. 1-5

E. 1-5
   2-4

F. 0-6
   1-5
   2-4

G. 2-4
*/
