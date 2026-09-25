package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book_Test 
{

	    public static void main(String[] args) {

	        List<Book> books = new ArrayList<>();

	        books.add(new Book("Java", 500));
	        books.add(new Book("Algorithms", 700));
	        books.add(new Book("Spring Boot", 600));

	        Collections.sort(books);

	        for (Book b : books) {
	            System.out.println(b);
	        }
	    }

}
