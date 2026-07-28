package com.Unchecked_Exception;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Exp_7 {
	
	public static void main(String[] args) {
		
		Scanner sc =null;
		int res=0;
		try {
			sc = new Scanner(System.in);
			int result = divide(20,0);
			System.out.println(result);
//			System.out.println("enter first number : ");
//			int num1 = sc.nextInt();
//			System.out.println("enter second number : ");
//			int num2 = sc.nextInt();
//			res = num1 / num2;
//			System.out.println("Divided value : " + res);
//			System.out.println("Hii");
		}
		catch(InputMismatchException | ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Executed..");
			sc.close();
		}
		System.out.println("Bye...");
	
	}
	
	
	public static int divide(int a, int b) {
		try {
			int res = a / b;
			return res;
		}
		catch(Exception e) {
			System.out.println(e);
			return 0;
		}
		finally {
			return 1;
		}
	}

}
