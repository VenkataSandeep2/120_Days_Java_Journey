package com.linkedList;

import java.util.LinkedList;

public class StudentManagement
{
    public static void main(String[] args)
    {
        LinkedList<String> students =
                new LinkedList<>();

        // Add
        students.add("Sai");
        students.add("Ravi");
        students.add("Kiran");

        System.out.println(
                "Students: " + students);

        // Add at beginning
        students.addFirst("Rahul");

        System.out.println(
                "After addFirst: " + students);

        // Add at end
        students.addLast("Suresh");

        System.out.println(
                "After addLast: " + students);

        // Get
        System.out.println(
                "First student: "
                + students.get(0));

        // Update
        students.set(1, "Arjun");

        System.out.println(
                "After update: " + students);

        // Search
        System.out.println(
                "Sai exists: "
                + students.contains("Sai"));

        // Remove first
        students.removeFirst();

        System.out.println(
                "After removeFirst: "
                + students);

        // Remove last
        students.removeLast();

        System.out.println(
                "After removeLast: "
                + students);

        // Size
        System.out.println(
                "Total students: "
                + students.size());

        // Iteration
        System.out.println(
                "Final Student List:");

        for(String student : students)
        {
            System.out.println(student);
        }
    }
}