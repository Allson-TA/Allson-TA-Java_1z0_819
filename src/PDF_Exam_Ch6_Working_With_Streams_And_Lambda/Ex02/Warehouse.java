package PDF_Exam_Ch6_Working_With_Streams_And_Lambda.Ex02;

import java.util.function.BooleanSupplier;

public class Warehouse {
	
	private int quantity = 40;
	private final BooleanSupplier stock;
	
	{
		stock= () -> quantity>0;
	}
	
	public void checkInventory() {
		if(stock.get())
			System.out.println("Plenty!");
		else {
			System.out.println("On Backorder");
		}
	}
	
	public static void main(String[] args) {
		final Warehouse w13 = new Warehouse();
		w13.checkInventory();
	}

}
/*
What is the output of the following application?  以下應用程式的輸出是什麼？

A. Plenty
B. On Backorder!
C. The code does not compile because of the checkInventory() method.  程式碼因為 checkInventory() 方法無法編譯
D. The code does not compile for a different reason  程式碼因其他原因無法編譯
*/
