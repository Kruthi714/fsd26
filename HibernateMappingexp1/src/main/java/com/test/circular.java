package com.test;
class A{
	//B b=new B();
}
class B{
//A a=new A();
}
public class circular {
	public static void main(String[] args) {
		System.out.println("MAIN");
		B b=new B();
		System.out.println("after object");
	}


}
