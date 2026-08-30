package com.arrayList;

import java.util.ArrayList;

public class Student {

    public static void main(String[] args)
    {
        ArrayList<String> students = new ArrayList<>();

        students.add("Sai");
        students.add("Ravi");
        students.add("Kiran");
        students.add("Rahul");
        System.out.println();
        

        System.out.println("Students : " + students);

        System.out.println("First Student : "+ students.get(0));
        
        System.out.println("Last Student : "+ students.get(3));
        
        students.set(1, "Rahul");
        
        System.out.println("After Update : "+ students);
        
        // Search
        System.out.println("Sai Available : "+ students.contains("Sai"));

        // Remove
        students.remove("Kiran");

        System.out.println("After Remove : "+ students);

        // Size
        System.out.println("Total Students : "+ students.size());

    }

}
