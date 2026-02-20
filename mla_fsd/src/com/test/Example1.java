package com.test;
interface Inf1{
	float pi=3.14f;
	void dis();//default it will be public abstract
	void cat();
	default void human() {
		System.out.println("default inf");
		animal();//in default only we can access the private fn
	}
	static String greetUser(String msg) {
		return msg;
	}
	private void animal() {
		System.out.println("private inf");
	}
//	public Inf1() {
//		constructor
//	}
}
interface Inf2{
	void book();
}
abstract class Abs1{
	public Abs1() {
		System.out.println("constructor");
	}
	public abstract void fox();
	public void color() {
		System.out.println("implementtio of abs1");
	}
}
class Impl1 extends Abs1 implements Inf1,Inf2{
	@Override
	public void fox() {
		System.out.println("abs implemented");
	}
	@Override
	public void book() {
		System.out.println("inf2 implemented");
	}
	@Override
	public void dis() {
		System.out.println("inf1 implemented");
	}
	@Override
	public void cat() {
		System.out.println("inf1 implemented");
	}
	
}


public class Example1 {
	public static void main(String[] args) {
		Impl1 obj=new Impl1();
		obj.fox();
		obj.cat();
		obj.dis();
		obj.book();
		obj.color();
		obj.human();
		//dynmaic binding:
		System.out.println(Inf1.greetUser("Hello MLA coders"));//using the class name only we can access the static method we cannot override
	}
//how many ways wecan create object for the class-1.using new operator,2.factory method,3.using clone() method,4.using class.forName() dynamic object creation
}
