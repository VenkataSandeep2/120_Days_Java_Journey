package com.byteStream;

import java.io.FileOutputStream;

public class WriteFile 
{
	public static void main(String[] args) 
	{
		try {
		FileOutputStream fos = new FileOutputStream("D:\\Sample.txt");
		
		String message = "helllo javaaaaa";
		fos.write(message.getBytes());
		fos.close();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
