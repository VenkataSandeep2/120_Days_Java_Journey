package com.byteStream;

import java.io.FileInputStream;

public class ReadChar 
{
	public static void main(String[] args) 
	{
		try {
//		FileInputStream fis = new FileInputStream("Sample.txt");
			FileInputStream fis = new FileInputStream("D:\\Java Developer Resume (3) - Copy.pdf");
		int data;
		while ((data = fis.read()) !=-1)
		{
			System.out.println((char)data);
		}
		fis.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
