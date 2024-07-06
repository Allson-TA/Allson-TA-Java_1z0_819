package p13;

public class Tester {
	
	private static int i;	//	物件變數預設都是0
	private static int[] primes = {2,3,5,7};	//	0,1,2,3
	private static String result = "";
	public static void main(String[] args) {
		while (i < primes.length) {
			
			if(i==3) {
				break;
			}
			i++;	//	陣列0開始遇到i++，所以原本陣列位置由0開始會直接i++ = 1
			result += primes[i];	//	result = result + primes[1] --> result變成1
		}
		System.out.println(result);	//	因為位置變成1，所以會顯示3，依此類推變成357
	}
}

/*
What is the result?
結果是什麼？

A. 235
B. 35
C. 2357
D. An ArrayIndexOutOfBoundsException is thrown at runtime
   執行時拋出 ArrayIndexOutOfBoundsException
E. 357
*/
