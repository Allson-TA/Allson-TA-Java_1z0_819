package p84;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class p84 {
	
	public static void main(String[] args) {
		
		//	不保留Java的，並且全部轉成大寫
		
		String fileName = "lines.txt";
		List<String> list = new ArrayList<>();
		try (Stream<String> stream = 
			Files.lines(Paths.get(fileName))){
			list = stream.filter(line -> !line.equalsIgnoreCase("JAVA")).map(String::toUpperCase).collect(Collectors.toList());
		} catch (Exception e) {
			
		}
		list.forEach(System.out::println);
		
		
	}

}
