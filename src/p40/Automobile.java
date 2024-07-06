package p40;

public  abstract class Automobile {
	abstract void wheels();
}



/*
要使代碼輸出 4，必須做的改變如下：
A. 將第 2 行的代碼替換為 Car ob = new Car(); //	與此題無關
B. 從第 3 行的 wheels 方法中移除參數
C. 移除第 1 行的 abstract 關鍵字	//	抽象方法需要實作
D. 在第 2 行添加 @Override 注釋	//	Override可以複寫但是不會印出4
*/

