package p03;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class p03 {
	public static void main(String[] args) {
		List<String> drawing = List.of("border","outloin","accent","limit");
		//	Comparator<String> c0 = (a,b) -> a.compareTo(b);	//	堤外:由大到小
		Comparator<String> c1 = (a,b) -> b.compareTo(a);	//	由小到大 outline limit border accent
		Comparator<String> c2 = c1.reversed();				//	轉變大到小 accent border limit outline
		String strDrawing = drawing.stream().sorted(c2).collect(Collectors.joining(" "));
		System.out.println(strDrawing);
	}
}

/*
What is the result?
結果是什麼？

A. limit accent outline border
B. border outline accent limit
C. accent border limit outline
D. outline limit border accent
*/

