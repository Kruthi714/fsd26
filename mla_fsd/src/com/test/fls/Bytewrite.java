
package com.test.fls;
import java.io.File;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class Bytewrite {
	public static void main(String[] args) throws Exception{
	File file=new File("src/bt.text");
	FileOutputStream fos=new FileOutputStream(file);
	BufferedOutputStream bos=new BufferedOutputStream(fos);
	String msg="This is byte stream code";
	bos.write(msg.getBytes());
	bos.flush();
	System.out.println("Done");
	}
}
