package com.checked_Exception;
import java.io.*;

public class Exp_3 {


	    public static void main(String[] args) {

	        try {

	            BufferedReader br =
	                    new BufferedReader(new FileReader("student.txt"));
//	            BufferedReader br =
//	                    new BufferedReader(new FileReader("C:\\Users\\SANDEEP\\OneDrive\\Desktop\\JavaNotesByGayatri\\JDBC.pdf"));
	            System.out.println(br.readLine());

	            br.close();

	        } catch (IOException e) {

	            System.out.println("I/O Operation Failed");
	        }
	    }
	
}
