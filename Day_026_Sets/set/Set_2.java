package com.set;
import java.util.HashSet;

public class Set_2 {

    public static void main(String[] args) {

        HashSet<String> skills = new HashSet<>();

        skills.add("Java");
        skills.add("SQL");
        skills.add("JDBC");
        skills.add("Java");
        skills.add("Spring Boot");
        skills.add("SQL");

        System.out.println("Unique Skills:");

        for (String skill : skills) {
            System.out.print(" "+skill);
        }
        System.out.println();
        System.out.println("Total Unique Skills: "+ skills.size());
    }
}