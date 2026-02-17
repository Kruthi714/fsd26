package com.test.fls;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
public class CharWrite {
	public static void main(String[] args) throws Exception{
	FileWriter fw=new FileWriter("src/ct.text");
	
	BufferedWriter bw =new BufferedWriter(fw);
	String msg="This is simple stream write and read operations";
	bw.write(msg);
	bw.flush();
	System.out.println("Done");
	}

}
