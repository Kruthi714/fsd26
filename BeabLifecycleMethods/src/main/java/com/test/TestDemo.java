package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
public static void main(String[] args) {
	AbstractApplicationContext ctx=new ClassPathXmlApplicationContext("beams.xml");
	ctx.registerShutdownHook();
	Triangle t=ctx.getBean("triangle",Triangle.class);
	t.draw();
	
}
}
