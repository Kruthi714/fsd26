package com.test.fls;

public class Employee {
	public int id=101;
	public String name="Rohit";
	public String cmp="Mphasis";
	private transient int pin=560048 
	@Override
	public String tostring() {
		return "Employee [id=" + id + ", name=" + name"]";
	}

}
