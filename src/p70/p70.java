package p70;

public class p70 {
	
	public static void main(String[] args) {
		
		StringBuilder txt1 = new StringBuilder("PPQRRRSTT");
		int i = 0;
		a:
			while(i<txt1.length()) {
				char x = txt1.charAt(i);
				int j = 0;
				i++;
			b:
				while(j<txt1.length()) {
					char y = txt1.charAt(j);
					if(i!=j && y ==x){
							txt1.deleteCharAt(j);
							continue a;
					}
					j++;
				}
				
			}
		System.out.println(txt1);
	}

}
/*
Which two statements inserted independently at line 1 enable this code to print PRRT ?
插入在第1行的哪兩個語句獨立運行能夠使代碼打印出 PRRT？

A. continue a;
   繼續 a;

B. continue b;
   繼續 b;

C. break a;
   跳出 a;

D. i--;
   i--;

E. j--;
   j--;

F. break b;
   跳出 b;
*/
