package com.byteStream;

import java.io.FileInputStream;

public class ReadByte_
{
	public static void main(String[] args) 
	{
		
		FileInputStream fis;
		try {
		 fis = new FileInputStream("C:\\Users\\SANDEEP\\Downloads\\Java complete notes.pdf");
		
		int data = fis.read();
		
		System.out.println(fis.read());
		
		System.out.println(fis.read());
		
		System.out.println(fis.read());
		
		System.out.println(fis.read());
		
		System.out.println(data);
		System.out.println(fis.read());
		System.out.println();
		System.out.println(fis.read());
		fis.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
