package p07;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Employee {
	
	private String name;
	private String neighborhood;
	private LocalDate birthday;
	private int salary;
	
	public Employee(String neighborhood,int salary) {
		this.neighborhood = neighborhood;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		List<Employee> roster = new ArrayList<>();
		roster.add(new Employee("B", 500));
		roster.add(new Employee("A", 300));
		roster.add(new Employee("B", 100));
		roster.add(new Employee("A", 600));
		
		Map<String,Optional<Employee>> m4 = roster.stream().collect(Collectors.groupingBy(Employee::getNeighborhood,
		           Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		// Line 1
	}
}

/*
Which code fragment on line 1 makes the m map contain the employee with the highest salary for each neighborhood?
第 1 行的哪段程式碼片段使 m 映射包含每個鄰域薪水最高的員工？

A. .collect(Collectors.groupingBy(e -> e.getNeighborhood(),
           Collectors.maxBy((x, y) -> y.getSalary() - x.getSalary())));	//	因為是maxBy，所以y-x = 小減大，陷阱錯誤

B. .collect(Collectors.groupingBy(Employee::getNeighborhood,
           Collectors.maxBy(Comparator.comparing(Employee::getSalary))));

C. .collect(Collectors.maxBy(Employee::getSalary,	//	要先放groupingBy再放maxBY
           Collectors.groupingBy(Comparator.comparing(e -> e.getNeighborhood()))));

D. .collect(Collectors.maxBy((x, y) -> y.getSalary() - x.getSalary(),	//	1.要先放groupingBy再放maxBY 2.因為是maxBy，所以y-x = 小減大，陷阱錯誤
           Collectors.groupingBy(Employee::getNeighborhood)));
*/

