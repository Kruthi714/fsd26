package com.test;

@FunctionalInterface
interface FuncInf{
	String greetUser(String name,String msg);
}
public class Exam {
	public static void main(String[] args) {
		FuncInf obj1=(String name,String msg)->
		{
			System.out.println("Hi"+name+" "+msg);
			return "Hello "+name+" MLA "+msg;
		};
		obj1.greetUser(" kru"," welcome to Fsd MetaGeek coders...");
		System.out.println(obj1.greetUser("kru" ,"welcome to Fsd MetaGeek coders.."));
	}
}
//non static-object .system is the final class from (java.lang.system).printstream contains println,print which are overloaded class,out is pubic static object for printstream class
//public final class java.lang.Systems{
//public static final java.io.PrintStream out;
//}
//public class java.io.PrintStream{
//	public void print(int);
//	public void println(float)
//}
//primitive to object autoboxing,o->p-autounboxing
//int x=200;
//Integer xx=x;//eg for unboxing