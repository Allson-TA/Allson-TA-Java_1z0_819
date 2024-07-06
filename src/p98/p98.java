package p98;

public class p98 {
	
	public static void main(String[] args) {
		
		int i = 10;
		do {
			for(int j = i/2; j > 0 ; j--) {
				System.out.println(j + " ");
			}
			i -= 2;
		} while (i >0);
	}
}

/*
What is the result?
結果是什麼？

A. 5 4 3 2 1 4 3 2 1 3 2 1 2 1 1 1
B. 5 4 3 2 1
C. 5
D. nothing
*/
