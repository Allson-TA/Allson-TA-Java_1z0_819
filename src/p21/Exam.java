package p21;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exam {
	
	public static void main(String[] args) {
	    var symbols = List.of("USD", "GBP", "EUR", "CNY");
	    var exchangeRate = List.of(1.0, 1.3255, 1.1969, 0.1558094);

	    var map1 = IntStream.range(0, Math.min(symbols.size(), exchangeRate.size()))
	                        .boxed()
	                        .collect(Collectors.toMap(i -> symbols.get(i), i -> 1.0 / exchangeRate.get(i)));

	    var map2 = map1.entrySet().stream()
	                   .sorted(Map.Entry.comparingByKey())
	                   .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
	                                             (oldValue, newValue) -> oldValue, LinkedHashMap::new));

	    map2.forEach((var k, var v) -> System.out.printf("%s -> %.2f%n", k, v));
	}

	
}

/*
What is the result?
結果是什麼？

A.
USD -> 1.00
GBP -> 0.75
EUR -> 0.84
CNY -> 6.42

B.
CNY -> 6.42
EUR -> 0.84
GMP -> 0.75
USD -> 1.00

C.
EUR -> 0.84
GMP -> 0.75
USD -> 1.00
CNY -> 6.42

D.
The compilation fails
編譯失敗
*/

