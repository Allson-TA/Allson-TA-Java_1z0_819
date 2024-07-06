package p50;

public class Cylinder implements Rectangle,Ellipse{
	
	public double calculateSurfaceArea(double l , double w , double majorR , double minorR) {
		double rectArea = Rectangle.super.calculateSurfaceArea(l, w);
		double ellipseArea = Ellipse.super.calculateSurfaceArea(majorR, minorR);
		return rectArea + ellipseArea*2;
	}
	
}


/*
What prevents this code from compiling?
是什麼原因導致這段程式碼無法編譯？

A. The calculateSurfaceArea methods within Cylinder must be declared default.
   Cylinder 中的 calculateSurfaceArea 方法必須宣告為 default。

B. The calculateSurfaceArea methods within Rectangle and Ellipse requires a public access modifier.
   Rectangle 和 Ellipse 中的 calculateSurfaceArea 方法需要 public 存取修飾符。

C. Cylinder requires an implementation of calculateSurfaceArea with two parameters.
   Cylinder 需要實作一個帶有兩個參數的 calculateSurfaceArea 方法。

D. Cylinder is not properly calling the Rectangle and Ellipse interfaces calculateSurfaceArea methods.
   Cylinder 沒有正確地呼叫 Rectangle 和 Ellipse 介面的 calculateSurfaceArea 方法。
*/
