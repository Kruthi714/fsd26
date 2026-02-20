package com.test;

import java.util.List;

public class CustDemo {
public static void main(String[] args) {
	CustDao cdao=new CustDao();
	Customer cst=new Customer();
	Customer cst3=new Customer();
	//cst.setC_id(2);
	cst.setC_name("moon");
	cst.setC_city("Kolkata");
	cdao.saveCustomer(cst);
	cst3.setC_name("Sky");
	cst3.setC_city("mangalore");
	cdao.saveCustomer(cst3);
	//cdao.updateCustomer(cst);
	//cdao.deleteCustomer(cst);
	List<Customer> list=cdao.getAllCustomers();
	list.forEach(System.out::println);
	
}
}
