package com.byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite 
{
	public static void main(String[] args) {
		File file = new File("Stu.txt");
		try {
		if(file.createNewFile())
		{
			System.out.println("new file created");
		}
		else 
		{
			System.out.println("Already Exist");
		}
		
		System.out.println();
		System.out.println("=======================");
		System.out.println("Write Data");
		
		FileOutputStream fos = new FileOutputStream(file);
		String data = "Name :- AVS";
		fos.write(data.getBytes());
		System.out.println("data is also writeen");
		
		
		System.out.println();
		System.out.println("===================");
		System.out.println();
		
		 FileInputStream fis = new FileInputStream(file);

         int ch;

         System.out.println("\nReading File");

         while((ch = fis.read()) != -1)
         {
             System.out.print((char) ch);
         }

         fis.close();

     }
     catch(IOException e)
     {
         e.printStackTrace();
     }
 }
}