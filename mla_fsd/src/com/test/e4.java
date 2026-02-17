package com.test;

public class e4 {
	public static void main(String[] args) {
//		System.out.println(11/0);
//		String nm=" ";
//		System.out.println(nm.charAt(1));
//		int x=Integer.parseInt("22a3");these are runtime exception so use exception handling method
		//compile time exception-class.forName()
		try {
			System.out.println(11/0);
			
		}
		catch(Exception e) {
			System.out.println(11/5);
		}
	}
}
