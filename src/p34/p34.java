package p34;

enum Status {
    BRONZE(5), SLIVER(10), GOLD(15);
    
    private int rate;
    
    private Status(int rate) {
        this.rate = rate;
    }
    
    public int getRate() {
        return rate;
    }
    
    public Status addStatus(int rate) {	//	這裡需要static
        return new Status(20);
    }
}

public class Test {
    public static void main(String[] args) {
        Status sliver = Status.SLIVER;
        System.out.println(sliver + sliver.getRate());	//	會將 platinum 和 platinum.getRate() 直接拼接在一起，可能會導致輸出結果難以理解。
        //	System.out.println(sliver + " " + sliver.getRate());
        Status platinum = Status.addStatus(20);	//	第16行要加上static才能使用
        System.out.println(platinum + platinum.getRate());	//	會將 platinum 和 platinum.getRate() 直接拼接在一起，可能會導致輸出結果難以理解。
        //	System.out.println(platinum + " " + platinum.getRate());
    }
}


	

/*
What is the result?
結果是什麼？

A. The compilation fails.
   編譯失敗。
   
B. SILVER10
   20
   
C. SILVER10
   PLATINUM20
   
D. An exception is thrown at run time.
   執行時拋出異常。
   
E. SILVER10
   platinum20
*/

