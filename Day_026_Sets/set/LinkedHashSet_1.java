package com.set;
import java.util.LinkedHashSet;

public class LinkedHashSet_1 {

    public static void main(String[] args) {

        LinkedHashSet<String> skills = new LinkedHashSet<>();

        // add()
        skills.add("Java");
        skills.add("SQL");
        skills.add("JDBC");
        skills.add("Java");       // duplicate

        System.out.println("Skills: " + skills);

        // contains()
        System.out.println("Contains Java: "
                + skills.contains("Java"));

        System.out.println("Contains Python: "
                + skills.contains("Python"));

        // size()
        System.out.println("Size: " + skills.size());

        // remove()
        skills.remove("SQL");

        System.out.println("After remove: " + skills);

        // isEmpty()
        System.out.println("Is Empty: " + skills.isEmpty());

        // iteration
        System.out.println("Skills one by one:");

        for (String skill : skills) {
            System.out.println(skill);
        }

        // clear()
        skills.clear();

        System.out.println("After clear: " + skills);

        System.out.println("Is Empty: " + skills.isEmpty());
    }
}