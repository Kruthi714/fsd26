package com.test.fls;

import java.io.BufferedReader;
import java.io.FileReader;

public class CharRead {
	public static void main(String[] args) throws Exception{
		FileReader fw=new FileReader("src/bt.text");
		
		BufferedReader bw =new BufferedReader(fw);
		String msg="This is simple stream write and read operations";
		bw.write(msg);
		bw.flush();
		System.out.println("Done");
		}
}
