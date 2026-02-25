package com.test.spring.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class EmployeeAspectPointCut {
	@Before("getNamePointCut()")
	public void loggingAdvice() {
		System.out.println("execution logging advice on getName()");
	}
	@Before("getNamePointCut()")
	public void secondAdvice() {
		System.out.println("executing secondAdvice on getName()");
	}
	@Pointcut("execution(public String getName())")
	public void getNamePointcut() {
		//System.out.println("executing secondAdvice on getName()");
	}
	@Before("allMehtodsPointcut()")
	public void allServiceMethodsAdvice() {
		System.out.println("Before executing service  on getName()");
	}
	@Pointcut("within(com.test.service.*)")
	public void allMehtodsPointcut() {
		
	}
	
}
