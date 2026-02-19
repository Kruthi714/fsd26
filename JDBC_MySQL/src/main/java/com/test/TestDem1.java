package com.test;

import java.util.List;

public class TestDem1 {
	public static void main(String[] args) {
		StudentDao edao=new StudentDao();
		Student st=new Student();
		st.setId(1);
		st.setName("raksha");
		st.setUsn("4mt22ci044");
		st.setCity("udupi");
		//edao.saveStudent(st);
		
	edao.updateStudent(st);
		
		
		System.out.println("save student Data.");
		List<Student> data=edao.getAllStudents();
		data.forEach(System.out::println);
	}
}
