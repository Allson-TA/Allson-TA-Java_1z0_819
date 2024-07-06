package p39;

import java.util.Collection;
import java.util.List;

public class Computator <N extends Number, C extends Collection<N>> {
	
	public N sum(C collection) {	//	line2
		double sum = 0.0;			//	line3
		for(N n : collection) {		// 	line4
			sum += n.doubleValue();
		}
		return sum;
		
		/*
		Java 的泛型系統並不支持將原生數據類型如 double 自動轉換成泛型數據類型 N。
		這裡的核心問題是 double 不能直接被轉換為任意的 Number 子類型，如 Integer、Float、Double 等。
		您需要決定一種方法來恰當地將 sum 的結果轉換為適合的 Number 子類型，或更改方法的返回類型。
		*/

	}
	
	public static void main(String[] args) {
		var numbers = List.of(5,4,6,3,7,2,8,1,9);
		Computator<Integer, List<Integer>> c = new Computator<>();
		System.out.println(c.sum(numbers));
	}
	
}

/*
Which action enables Computator class to compile?
哪個動作可以使 Computator 類編譯通過？

A. change Line 2 to public Double sum(C collection) {
   將第2行更改為 public Double sum(C collection) {

B. change Line 3 to Double sum = 0.0
   將第3行更改為 Double sum = 0.0

C. change Line 5 to List<Double> numbers = List.of(5, 4, 6, 3, 7, 2, 8, 1, 9);
   將第5行更改為 List<Double> numbers = List.of(5, 4, 6, 3, 7, 2, 8, 1, 9);

D. change Line 4 to for(Double n : collection) {
   將第4行更改為 for(Double n : collection) {

E. change Line 1 to add throws NumberFormatException
   在第1行添加 throws NumberFormatException
*/

