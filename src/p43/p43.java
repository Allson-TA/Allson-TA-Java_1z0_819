package p43;

public class p43 {
	
	public static void main(String[] args) {
		
		int x = 0;
		do {
			x++;	//	0+1
			if(x ==1 ) {	// 1==1
				continue;	//	直接挑到while
			}
			System.out.println(x);
		} while(x<1);	//	1<1不成立
		//	會直接結束，所以不會印出任何東西
	}
	
}

/**
What is the result?
結果是什麼？

A. 0 1
0 1

B. 1
1

C. The program prints nothing
程式不會印出任何東西

D. It prints 1 in the infinite loop
它會在無限迴圈中打印1
*/
