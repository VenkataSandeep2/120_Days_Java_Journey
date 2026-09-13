package com.linkedList;
	import java.util.ArrayList;
	import java.util.*;

	public class ListIterator_1
	{

	    public static void main(String[] args) 
	    {

	        // Create List
	        List<String> students = new ArrayList<>();

	        students.add("Sandeep");
	        students.add("Ravi");
	        students.add("Kiran");
	        students.add("Arjun");

	        System.out.println("Original List:");
	        System.out.println(students);


	        // Create ListIterator
	        ListIterator <String> iterator = students.listIterator();


	        // 1. hasNext()
	        System.out.println("\n--- hasNext() and next() ---");

	        while (iterator.hasNext()) {

	            System.out.println("Next Index: " + iterator.nextIndex());

	            String name = iterator.next();

	            System.out.println("Student: " + name);
	        }


	        // At this point cursor is at the end of the list


	        // 2. hasPrevious()
	        // 3. previous()
	        // 4. previousIndex()

	        System.out.println("\n--- hasPrevious() and previous() ---");

	        while (iterator.hasPrevious()) {

	            System.out.println("Previous Index: "
	                    + iterator.previousIndex());

	            String name = iterator.previous();

	            System.out.println("Student: " + name);
	        }


	        // Cursor is now at the beginning


	        // Move to "Ravi"
	        iterator.next();       // Sandeep
	        iterator.next();       // Ravi


	        // 5. set()
	        System.out.println("\n--- set() ---");

	        iterator.set("Rahul");

	        System.out.println(students);


	        // 6. add()
	        System.out.println("\n--- add() ---");

	        iterator.add("Priya");

	        System.out.println(students);


	        // 7. remove()
	        System.out.println("\n--- remove() ---");

	        iterator.previous();   // Move back to Priya
	        iterator.remove();

	        System.out.println(students);


	        // Final List
	        System.out.println("\nFinal List:");
	        System.out.println(students);
	    }
	}

