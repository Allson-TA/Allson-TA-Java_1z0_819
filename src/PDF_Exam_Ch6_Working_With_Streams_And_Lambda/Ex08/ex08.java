package PDF_Exam_Ch6_Working_With_Streams_And_Lambda.Ex08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex08 {
	
	public static void main(String[] args) {
		
		String fileName = "lines.txt";
		List<String> list =  new ArrayList<>();
		
		try (Stream<String> stream =  Files.lines(Paths.get(fileName))){
			list = stream.filter(line->!line.equalsIgnoreCase("JAVA"))
						 .map(String::toUpperCase)
						 .collect(Collectors.toList());
		} catch (IOException e) {
			
		}
		
		list.forEach(System.out::println);
	}
}

/*
What is the Result? 什麼是結果？

A) C
   C++
   Go
   Kotlin

B) JAVA

C) C
   C++
   GO
   KOTLIN

D) C
   C++
   JAVA
   GO
   KOTLIN
*/
