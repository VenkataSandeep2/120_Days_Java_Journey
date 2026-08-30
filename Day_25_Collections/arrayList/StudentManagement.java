package com.arrayList;

import java.util.ArrayList;

public class StudentManagement {
	    public static void main(String[] args)
	    {
	        ArrayList<String> students = new ArrayList<>();

	        // Add students
	        students.add("Sai");
	        students.add("Ravi");
	        students.add("Kiran");
	        students.add("Rahul");

	        System.out.println("Students: " + students);

	        // Get student
	        System.out.println("Student at index 1: "+ students.get(1));

	        // Update student
	        students.set(2, "Suresh");

	        System.out.println("After update: "+ students);

	        // Check student
	        System.out.println("Sai available: "+ students.contains("Sai"));

	        // Remove student
	        students.remove("Ravi");

	        System.out.println("After removing Ravi:"+ students);

	        // Size
	        System.out.println("Total students: "+ students.size());

	        // Iteration
	        System.out.println("Student List:");

	        for(String student : students)
	        {
	            System.out.println(student);
	        }
	    }
	}

