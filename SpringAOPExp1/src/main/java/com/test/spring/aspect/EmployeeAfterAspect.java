package com.test.spring.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
@Aspect
public class EmployeeAfterAspect {
	@After("args(name)")
	public void logStringArguments(String name) {
		System.out.println("Running after advice String argument ");
	}
	@AfterThrowing("within(com.test.model.Employee)")
	public void logException(JoinPoint jointPoint) {
		System.out.println("exception thrown in employee methods "+jointPoint.toString());
	}
	@AfterReturning(pointcut="execution(* getName()", returning="returnString")
//	it should match with returnString in next line
	public void getNameReturningAdvice(String returnString) {
		System.out.println("getNameReturningAdvice executed Returning string "+returnString);
	}
}
