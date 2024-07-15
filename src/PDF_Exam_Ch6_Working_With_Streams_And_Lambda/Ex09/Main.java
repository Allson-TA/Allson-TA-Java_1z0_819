package PDF_Exam_Ch6_Working_With_Streams_And_Lambda.Ex09;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		
		List<Employee> roster = new ArrayList<>();
		Predicate<Employee> p = e -> e.getSalary()>30;
		Function<Employee, Optional<String>> f = 
				e -> Optional.ofNullable(e.getNeighborhood());
		
	}
	
}
/*
Which two objects group all employees with a salary greater than 30 by neighborhood? 哪兩個物件根據區域將薪水大於30的所有員工分組？

A) Map<Optional<String>, List<Employee>> r4 = roster.stream()
      .collect(Collectors.groupingBy(f, Collectors.filtering(p, Collectors.toList())));

B) Map<Optional<String>, List<Employee>> r2 = roster.stream().filter(p)
      .collect(Collectors.groupingBy(f, Employee::getNeighborhood));

C) Map<Optional<String>, List<Employee>> r5 = roster.stream()
      .collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.filtering(p, Collectors.toList())));

D) Map<Optional<String>, List<Employee>> r3 = roster.stream().filter(p)
      .collect(Collectors.groupingBy(p));

E) Map<String, List<Employee>> r1 = roster.stream()
      .collect(Collectors.groupingBy(Employee::getNeighborhood, Collectors.filtering(p, Collectors.toList())));
*/
