package com.test;

import java.util.List;

public class TestDemo {
public static void main(String[] args) {
	EmpDao edao=new EmpDao();
	Employee emp1=new Employee();
	emp1.setId(1);
	emp1.setName("k");
	emp1.setCmp("B");
	emp1.setCity("H");
//	edao.saveEmployee(emp1);
	emp1.setId(2);
	emp1.setName("rahul");
	emp1.setCmp("mphasis");
	emp1.setCity("Bangalore");
	
	edao.saveEmployee(emp1);
	emp1.setId(3);
	emp1.setName("kruthi");
	emp1.setCmp("mphasis");
	emp1.setCity("Bangalore");
//	edao.updateEmployee(emp1);
	System.out.println("update Employee Data.");
	List<Employee> data=edao.getAllEmployees();
	data.forEach(System.out::println);
}
}
