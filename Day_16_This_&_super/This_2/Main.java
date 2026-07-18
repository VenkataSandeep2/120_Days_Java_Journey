package com.This_2;

public class Main {
	public static void main(String[] args) {
		Student stu = new Student("Sandeep", "CSE");
		stu.display();
		System.out.println();

		Student stu1 = new Student(null, null);
		stu1.display();
		System.out.println();
	
		Student stu2 = new Student("Sanp", "ECE");
		stu2.display();
				
	}

}
