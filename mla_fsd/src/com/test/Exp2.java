package com.test;
@FunctionalInterface
interface FunInf{
	void draw();//only one abstract class should be there in functional interface void color(); if we write it will give an error
	default void dog() {
		
	}
	static void cat() {
		
	}
	
}
class Circle implements FunInf{
	@Override
	public void draw() {
		System.out.println("circle");
	}
}
class Square implements FunInf{
	@Override
	public void draw() {
		System.out.println("square");//polymorphism
	}
	//factory method
	public Square getObj() {
		System.out.println("object returned");
		return new Square();
	}
}
public class Exp2 {
	public static void main(String[] args) {
//		Circle obj1=new Circle();
//		obj1.draw();//2 types memory allocation for child and parent 
		FunInf obj1=new Circle();
		obj1.draw();//dynamic binding 1 time memory allocation
		Square obj2=new Square();
		obj2.draw();
//		Square obj3=obj2.getObj();
		FunInf obj3=()->System.out.println("circle");//if in interface there is an parameter then we have to pass parameter here and we can use braces here after arrow.arrow means mapping
		obj3.draw();//lambda expressions
	
	}

}
