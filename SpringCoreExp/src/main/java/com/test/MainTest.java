package com.test;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainTest {
	public static void main(String[] args) {
		//ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		//Customer obj=(Customer)ctx.getBean("cst",Customer.class);//it is in bean so casting is used to convert into book
		//System.out.println(obj);
		//or
		//Customer obj=(Customer)ctx.getBean("cst1",Customer.class);//it is in bean so casting is used to convert into book
		//System.out.println(obj);
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AnnoConfig.class);
		Address aobj=ctx.getBean(Address.class);
		aobj.setCity("Tirumala");
		aobj.setState("Ap");
		aobj.setCountry("IN");
		Customer cst=ctx.getBean(Customer.class);
		cst.setId(1011);
		cst.setName("sky");
		cst.setAdr(aobj);
		System.out.println(cst);
	}
	
}
