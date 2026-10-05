package com.learn;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee{
	
	int sal;
	@Override
	public String toString() {
		return "Employee [sal=" + sal + ", name=" + name + ", dep=" + dep + "]";
	}

	String name;
	String dep;
	
	Employee(String name,String dep,int sal){
		this.dep=dep;
		this.sal=sal;
		this.name=name;
		
	}
}
 
public class GroupBy {

	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
			    new Employee("John", "IT", 60000),
			    new Employee("Alice", "HR", 50000),
			    new Employee("David", "IT", 70000),
			    new Employee("Bob", "HR", 55000),
			    new Employee("Alex", "Finance", 65000)
			);
		
		Map<String, List<String>> collect = employees.stream().collect(Collectors.groupingBy(n->n.dep,Collectors.mapping(n->n.name, Collectors.toList())));
		
		System.out.println(collect);

	}

}
