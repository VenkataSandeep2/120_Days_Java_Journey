package com.byteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadAllByte
{
    public static void main(String[] args)
    {
        try
        {
//            FileInputStream fis = 
//            						new FileInputStream("sample.txt");	// file location Path

            FileInputStream fis = 
					new FileInputStream("sample.txt");

        	int data;

            while((data = fis.read()) != -1)
            {
                System.out.println(data);
            }

            fis.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
