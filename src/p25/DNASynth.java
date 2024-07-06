package p25;

public class DNASynth {
	
	int aCount;
	int tCount;
	int cCount;
	int gCount;
	
	public DNASynth(int a , int t , int c , int g) {
		//	line1
		setGCount(g);
		aCount = a;
		cCount = setCCount(c);
		
	}
	
	int setCCount(int c) {
		return c;
	}
	
	void setGCount(int gCount) {
		this.gCount = gCount;
	}
}

/*
Which two lines of code when inserted in line 1 correctly modifies instance variable?
哪兩行代碼插入第 1 行時能正確地修改實例變量？

A. setGCount(g);
B. aCount = a;
C. setCCount(c) = cCount;
D. tCount = tCount;
E. cCount = setCCount(c);
*/
