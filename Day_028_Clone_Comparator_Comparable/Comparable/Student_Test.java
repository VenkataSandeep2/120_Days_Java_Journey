package com.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student_Test 
{
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student(103, "Kiran"));
        students.add(new Student(101, "Sandeep"));
        students.add(new Student(102, "Ravi"));

        Collections.sort(students);

        System.out.println(students);
    }
}


